# Student CRUD Operations Using Java Swing and CSV

A simple **Student CRUD Management System** developed using Java Swing and CSV file handling. The application provides a graphical user interface to perform Create, Read, Update, and Delete (CRUD) operations on student records.

The application accepts a student's name and password and stores the information in a CSV file named `students.csv`.

## Features

- **Create:** Add a new student record with name and password.
- **Read:** Display all saved student records.
- **Update:** Update the password of an existing student using their name.
- **Delete:** Delete an existing student record using their name.
- **Duplicate Check:** Prevents creating records with an existing name.
- **CSV Storage:** Automatically creates and updates the CSV file.
- **Input Validation:** Checks that name and password are entered before performing operations.
- **Graphical Interface:** Simple and user-friendly interface using Java Swing.

## Technologies Used

- Java
- Java Swing (GUI)
- Java AWT
- File Handling
- CSV File Handling
- UTF-8 Character Encoding
- ArrayList and List

## Project Structure

```text
StudentCRUD/
│
├── StudentCRUD.java
├── students.csv
└── README.md
```

**Note:** The `students.csv` file is automatically created when the first student record is saved.

## Application Interface

The application contains the following components:

| Component | Description |
|---|---|
| Name | Accepts the student's name |
| Password | Accepts the student's password |
| Create Button | Creates a new student record |
| Read Button | Displays all stored records |
| Update Button | Updates an existing student's password |
| Delete Button | Deletes an existing student record |
| Status Label | Displays operation status and messages |

## CRUD Operations

### 1. Create
- Enter the student's name and password.
- Click the Create button.
- The application checks for duplicate names.
- The new record is saved in `students.csv`.

### 2. Read
- Click the Read button.
- All saved student records are displayed in a message window.

### 3. Update
- Enter the existing student's name.
- Enter the new password.
- Click the Update button.
- The password of the matching student is updated in the CSV file.

### 4. Delete
- Enter the student's name.
- Click the Delete button.
- Confirm the deletion.
- The matching student record is removed from the CSV file.

## CSV File Format

Student records are stored in the following format:

```csv
Name,Password
"Alok thakur","alok123"
"Rahul Sharma","rahul456"
"Aman Kumar","aman789"
```

The application uses UTF-8 encoding and handles commas and escaped quotation marks in CSV values.

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 8 or above)
- IntelliJ IDEA or any Java IDE

### Steps

1. Create a Java project in IntelliJ IDEA.
2. Create a Java class named `StudentCRUD`.
3. Paste the source code into `StudentCRUD.java`.
4. Ensure that the filename and public class name match.
5. Run `StudentCRUD.java`.
6. The Student CRUD Operations window will appear.
7. Enter a name and password to perform CRUD operations.

## Learning Outcomes

Through this project, I learned:

- Creating graphical applications using Java Swing.
- Understanding JFrame, JPanel, JLabel, JTextField and JPasswordField.
- Implementing Create, Read, Update and Delete operations.
- Handling button click events using ActionListener.
- Reading and writing data using Java File Handling.
- Storing records in CSV format.
- Using ArrayList and List to manage records.
- Implementing basic input validation.
- Working with UTF-8 character encoding.

## Important Note

This project uses **CSV file handling instead of JDBC or MySQL** for storing student records.

Passwords are stored in plain text for academic demonstration purposes. Real-world applications should use secure password hashing and proper authentication mechanisms.

## Author

**Hemanta Mukherjee**

## License

This project is developed for educational and academic practical purposes.