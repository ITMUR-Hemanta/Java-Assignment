
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD extends JFrame {

    private JTextField nameField;
    private JPasswordField passwordField;
    private JLabel statusLabel;

    private static final String FILE_NAME = "students.csv";

    public StudentCRUD() {

        setTitle("Student CRUD Operations");
        setSize(600, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 15));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(25, 20, 15, 20)
        );

        // Input Form
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 15, 15));

        JLabel nameLabel = new JLabel("Name:");
        JLabel passwordLabel = new JLabel("Password:");

        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 14));

        nameField = new JTextField();
        passwordField = new JPasswordField();

        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));

        formPanel.add(nameLabel);
        formPanel.add(nameField);

        formPanel.add(passwordLabel);
        formPanel.add(passwordField);

        // CRUD Buttons
        JButton createButton = new JButton("Create");
        JButton readButton = new JButton("Read");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 12, 12));

        buttonPanel.add(createButton);
        buttonPanel.add(readButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        // Button Styling
        JButton[] buttons = {
                createButton, readButton, updateButton, deleteButton
        };

        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setFocusPainted(false);
        }

        // Status Label
        statusLabel = new JLabel("Enter name and password.");
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        // Layout
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(statusLabel, BorderLayout.SOUTH);

        add(mainPanel);

        // Button Actions
        createButton.addActionListener(e -> createRecord());
        readButton.addActionListener(e -> readRecords());
        updateButton.addActionListener(e -> updateRecord());
        deleteButton.addActionListener(e -> deleteRecord());

        setVisible(true);
    }

    // CREATE OPERATION
    private void createRecord() {

        String name = nameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Please enter name and password.");
            return;
        }

        List<String[]> records = loadRecords();

        for (String[] record : records) {
            if (record[0].equalsIgnoreCase(name)) {
                statusLabel.setText("Name already exists.");
                return;
            }
        }

        records.add(new String[]{name, password});

        if (saveRecords(records)) {
            statusLabel.setText("Record created successfully!");
            clearFields();
        }
    }

    // READ OPERATION
    private void readRecords() {

        List<String[]> records = loadRecords();

        if (records.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "No records found.",
                    "Read Records",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        StringBuilder output = new StringBuilder();

        output.append("NAME\t\tPASSWORD\n");
        output.append("------------------------------------------\n");

        for (String[] record : records) {
            output.append(record[0])
                    .append("\t\t")
                    .append(record[1])
                    .append("\n");
        }

        JTextArea textArea = new JTextArea(output.toString());
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));

        JOptionPane.showMessageDialog(
                this,
                new JScrollPane(textArea),
                "Student Records",
                JOptionPane.INFORMATION_MESSAGE
        );

        statusLabel.setText("Records displayed successfully.");
    }

    // UPDATE OPERATION
    private void updateRecord() {

        String name = nameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Enter name and new password.");
            return;
        }

        List<String[]> records = loadRecords();
        boolean found = false;

        for (String[] record : records) {

            if (record[0].equalsIgnoreCase(name)) {
                record[1] = password;
                found = true;
                break;
            }
        }

        if (found) {

            if (saveRecords(records)) {
                statusLabel.setText("Record updated successfully!");
                clearFields();
            }

        } else {
            statusLabel.setText("Record not found.");
        }
    }

    // DELETE OPERATION
    private void deleteRecord() {

        String name = nameField.getText().trim();

        if (name.isEmpty()) {
            statusLabel.setText("Enter name to delete the record.");
            return;
        }

        List<String[]> records = loadRecords();
        boolean found = false;

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this record?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        for (int i = 0; i < records.size(); i++) {

            if (records.get(i)[0].equalsIgnoreCase(name)) {
                records.remove(i);
                found = true;
                break;
            }
        }

        if (found) {

            if (saveRecords(records)) {
                statusLabel.setText("Record deleted successfully!");
                clearFields();
            }

        } else {
            statusLabel.setText("Record not found.");
        }
    }

    // LOAD RECORDS FROM CSV
    private List<String[]> loadRecords() {

        List<String[]> records = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return records;
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file),
                        StandardCharsets.UTF_8
                ))) {

            String line;
            boolean header = true;

            while ((line = reader.readLine()) != null) {

                if (header) {
                    header = false;
                    continue;
                }

                if (!line.trim().isEmpty()) {

                    String[] data = parseCSV(line);

                    if (data.length == 2) {
                        records.add(data);
                    }
                }
            }

        } catch (IOException ex) {
            showError("Error reading CSV: " + ex.getMessage());
        }

        return records;
    }

    // SAVE RECORDS TO CSV
    private boolean saveRecords(List<String[]> records) {

        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(FILE_NAME),
                        StandardCharsets.UTF_8
                )
        )) {

            writer.println("Name,Password");

            for (String[] record : records) {

                writer.println(
                        csv(record[0]) + "," + csv(record[1])
                );
            }

            return true;

        } catch (IOException ex) {

            showError("Error saving CSV: " + ex.getMessage());
            return false;
        }
    }

    // CSV ESCAPING
    private String csv(String value) {
        return "\"" + value.replace("\"", "\"\"") + "\"";
    }

    // CSV PARSING
    private String[] parseCSV(String line) {

        List<String> values = new ArrayList<>();
        StringBuilder value = new StringBuilder();
        boolean insideQuotes = false;

        for (int i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);

            if (ch == '"') {

                if (insideQuotes &&
                        i + 1 < line.length() &&
                        line.charAt(i + 1) == '"') {

                    value.append('"');
                    i++;

                } else {
                    insideQuotes = !insideQuotes;
                }

            } else if (ch == ',' && !insideQuotes) {

                values.add(value.toString());
                value.setLength(0);

            } else {
                value.append(ch);
            }
        }

        values.add(value.toString());

        return values.toArray(new String[0]);
    }

    // CLEAR FIELDS
    private void clearFields() {

        nameField.setText("");
        passwordField.setText("");
    }

    // ERROR MESSAGE
    private void showError(String message) {

        JOptionPane.showMessageDialog(
                this,
                message,
                "File Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    // MAIN METHOD
    public static void main(String[] args) {

        SwingUtilities.invokeLater(StudentCRUD::new);
    }
}
