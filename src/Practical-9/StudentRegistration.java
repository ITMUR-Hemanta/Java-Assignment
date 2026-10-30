
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistration extends JFrame {

    private JTextField nameField;
    private JPasswordField passwordField;
    private JTable studentTable;
    private DefaultTableModel tableModel;

    private static final String FILE_NAME = "students.csv";

    public StudentRegistration() {

        setTitle("Student Registration & Management Portal");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // Heading
        JLabel heading = new JLabel(
                "STUDENT REGISTRATION PORTAL",
                JLabel.CENTER
        );
        heading.setFont(new Font("Arial", Font.BOLD, 22));
        mainPanel.add(heading, BorderLayout.NORTH);

        // Input form
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        formPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        formPanel.add(passwordField);

        // Table
        tableModel = new DefaultTableModel(
                new String[]{"Student Name", "Password"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        studentTable = new JTable(tableModel);
        studentTable.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(studentTable);

        // Buttons
        JButton addButton = new JButton("Add Student");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton refreshButton = new JButton("View Records");
        JButton clearButton = new JButton("Clear");

        JPanel buttonPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 10, 10)
        );

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(refreshButton);
        buttonPanel.add(clearButton);

        // Center layout
        JPanel centerPanel = new JPanel(new BorderLayout(10, 15));
        centerPanel.add(formPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        add(mainPanel);

        // Button actions
        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        refreshButton.addActionListener(e -> loadStudents());
        clearButton.addActionListener(e -> clearFields());

        // Select table row to edit
        studentTable.getSelectionModel().addListSelectionListener(e -> {

            if (!e.getValueIsAdjusting()) {
                int row = studentTable.getSelectedRow();

                if (row >= 0) {
                    nameField.setText(
                            tableModel.getValueAt(row, 0).toString()
                    );

                    passwordField.setText(
                            tableModel.getValueAt(row, 1).toString()
                    );
                }
            }
        });

        loadStudents();
        setVisible(true);
    }

    // CREATE: Add a new student
    private void addStudent() {

        String name = nameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this, "Please enter name and password."
            );
            return;
        }

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String existingName =
                    tableModel.getValueAt(i, 0).toString();

            if (existingName.equalsIgnoreCase(name)) {
                JOptionPane.showMessageDialog(
                        this, "Student already exists!"
                );
                return;
            }
        }

        tableModel.addRow(new Object[]{name, password});

        saveStudents();
        clearFields();

        JOptionPane.showMessageDialog(
                this, "Student added successfully!"
        );
    }

    // READ: Display student records
    private void loadStudents() {

        tableModel.setRowCount(0);

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file),
                        StandardCharsets.UTF_8))) {

            String line;

            while ((line = reader.readLine()) != null) {

                List<String> fields = parseCSV(line);

                if (fields.size() >= 2 &&
                        !fields.get(0).equals("Name")) {

                    tableModel.addRow(new Object[]{
                            fields.get(0),
                            fields.get(1)
                    });
                }
            }

        } catch (IOException ex) {
            showError(ex);
        }
    }

    // UPDATE: Modify selected student
    private void updateStudent() {

        int row = studentTable.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this, "Please select a student to update."
            );
            return;
        }

        String name = nameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this, "Name and password cannot be empty."
            );
            return;
        }

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (i != row &&
                    tableModel.getValueAt(i, 0).toString()
                            .equalsIgnoreCase(name)) {

                JOptionPane.showMessageDialog(
                        this, "Another student already has this name."
                );
                return;
            }
        }

        tableModel.setValueAt(name, row, 0);
        tableModel.setValueAt(password, row, 1);

        saveStudents();
        clearFields();

        JOptionPane.showMessageDialog(
                this, "Student record updated successfully!"
        );
    }

    // DELETE: Remove selected student
    private void deleteStudent() {

        int row = studentTable.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this, "Please select a student to delete."
            );
            return;
        }

        int choice = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this record?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {

            tableModel.removeRow(row);

            saveStudents();
            clearFields();

            JOptionPane.showMessageDialog(
                    this, "Student deleted successfully!"
            );
        }
    }

    // SAVE: Store table data in CSV
    private void saveStudents() {

        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(FILE_NAME),
                        StandardCharsets.UTF_8))) {

            writer.println("\"Name\",\"Password\"");

            for (int i = 0; i < tableModel.getRowCount(); i++) {

                String name =
                        tableModel.getValueAt(i, 0).toString();

                String password =
                        tableModel.getValueAt(i, 1).toString();

                writer.println(
                        csv(name) + "," + csv(password)
                );
            }

        } catch (IOException ex) {
            showError(ex);
        }
    }

    // Format CSV values
    private String csv(String value) {
        return "\"" + value.replace("\"", "\"\"") + "\"";
    }

    // Read quoted CSV values
    private List<String> parseCSV(String line) {

        List<String> fields = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean quoted = false;

        for (int i = 0; i < line.length(); i++) {

            char c = line.charAt(i);

            if (c == '"') {

                if (quoted && i + 1 < line.length()
                        && line.charAt(i + 1) == '"') {

                    field.append('"');
                    i++;

                } else {
                    quoted = !quoted;
                }

            } else if (c == ',' && !quoted) {

                fields.add(field.toString());
                field.setLength(0);

            } else {
                field.append(c);
            }
        }

        fields.add(field.toString());
        return fields;
    }

    // Clear input fields
    private void clearFields() {

        nameField.setText("");
        passwordField.setText("");
        studentTable.clearSelection();
    }

    // Display file errors
    private void showError(IOException ex) {

        JOptionPane.showMessageDialog(
                this,
                "File Error: " + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(StudentRegistration::new);
    }
}
