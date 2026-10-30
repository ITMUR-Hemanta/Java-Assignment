# LoginApplet – Student Registration Portal

A Java-based **Student Registration Portal** developed using Java Swing. The application provides a graphical user interface (GUI) that allows users to enter student details, register students, clear form fields, and view saved registrations.

Student records are stored in a CSV file using Java File Handling.

## Features

- **Student Registration:** Enter and save student information.
- **Student Name:** Accepts the student's full name.
- **Roll Number:** Stores the student's roll number.
- **Email Address:** Accepts the student's email address.
- **Phone Number:** Stores the student's contact number.
- **Course:** Accepts the student's course details.
- **Gender Selection:** Provides a dropdown menu with Male, Female, and Other options.
- **Clear Form:** Clears all input fields.
- **View Registrations:** Displays previously saved student records.
- **CSV Storage:** Automatically creates and updates `students.csv`.
- **Input Validation:** Checks that all fields are filled before registration.

## Technologies Used

- Java
- Java Swing (GUI)
- Java AWT
- Java File Handling
- CSV File Handling
- UTF-8 Character Encoding

## Project Structure

```text
LoginApplet/
│
├── LoginApplet.java
├── students.csv
└── README.md
```

**Note:** The `students.csv` file is automatically created when the first student is registered.

## Application Components

| Component | Purpose |
|---|---|
| JFrame | Creates the main application window |
| JPanel | Organises the form components |
| JLabel | Displays field names and status messages |
| JTextField | Accepts student information |
| JComboBox | Provides gender selection |
| JButton | Performs registration, clearing, and viewing operations |
| JTextArea | Displays saved registration records |
| JOptionPane | Displays messages and error dialogs |

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 8 or above)
- IntelliJ IDEA or any Java IDE

### Steps

1. Create a Java project in IntelliJ IDEA.
2. Create a Java class named `LoginApplet`.
3. Paste the source code into `LoginApplet.java`.
4. Ensure the public class name and filename match.
5. Run `LoginApplet.java`.
6. The Student Registration Portal window will appear.
7. Enter the student details and click **Register**.

## CSV File Format

Student information is stored in `students.csv` in the following format:

```csv
Name,Roll Number,Email,Phone,Course,Gender
"Hemanta Mukherjee","101","hemanta@example.com","9876543210","B.Tech","Male"
```

The application uses UTF-8 encoding and escapes commas and quotation marks in individual CSV values.

## Application Operations

| Operation | Description |
|---|---|
| Register | Saves student information to the CSV file |
| Clear Form | Resets all input fields |
| View Registrations | Displays the saved CSV records |

## Learning Outcomes

Through this project, I learned:

- Creating GUI applications using Java Swing.
- Understanding JFrame, JPanel, JLabel, JTextField and JComboBox.
- Handling button click events using ActionListener.
- Implementing input validation.
- Reading and writing data using Java File Handling.
- Storing structured data in CSV format.
- Using UTF-8 character encoding.
- Displaying messages and records using JOptionPane.

## Important Note

Despite its filename, `LoginApplet.java`, this project uses Java Swing (`JFrame`) and is not an actual Java Applet. It is designed to run as a standalone desktop application in IntelliJ IDEA.

## Author

**Hemanta Mukherjee**

## License

This project is developed for educational and academic practical purposes.