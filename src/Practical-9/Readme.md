# Student Registration Portal

A simple **Student Registration Portal** developed using **Java Swing** and **CSV file handling**. The application provides a graphical interface to manage student records through Create, Read, Update, and Delete (CRUD) operations.

## Features

- **Add Student:** Register a new student using their name and password.
- **View Records:** Display all registered students in a table.
- **Update Student:** Modify the password of a selected student.
- **Delete Student:** Remove a selected student record after confirmation.
- **Clear Fields:** Clear the input fields.
- **Duplicate Check:** Prevent registration using an existing student name.
- **CSV Storage:** Store and manage records in a CSV file.

## Technologies Used

- Java
- Java Swing (GUI)
- Java AWT
- CSV File Handling
- File I/O
- ArrayList and List

## Project Structure

```text
StudentRegistration/
│
├── StudentRegistration.java
├── students.csv
└── README.md
```

**Note:** The `students.csv` file is automatically created when records are saved for the first time.

## Application Interface

The application contains:

- Student Name input field
- Password input field
- Add Student button
- Update button
- Delete button
- View Records button
- Clear button
- JTable to display student records

## How to Run

### Prerequisites

- Java Development Kit (JDK 8 or above)
- IntelliJ IDEA or any Java IDE

### Steps

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Open `StudentRegistration.java`.
4. Make sure the filename and public class name match.
5. Run the `StudentRegistration` class.
6. The Student Registration Portal window will appear.

## CSV File Format

Student records are stored in `students.csv` in the following format:

```csv
"Name","Password"
"Rahul","rahul123"
"Aman","aman456"
```

The application uses UTF-8 encoding and handles commas and escaped quotation marks in CSV fields.

## CRUD Operations

| Operation | Description |
|---|---|
| Create | Adds a new student record |
| Read | Displays saved student records in a table |
| Update | Updates the password of a selected student |
| Delete | Deletes a selected student record |

## Learning Outcomes

Through this project, I learned:

- Creating graphical user interfaces using Java Swing.
- Working with JFrame, JTextField, JPasswordField and JTable.
- Implementing CRUD operations.
- Reading and writing data using CSV files.
- Handling file operations in Java.
- Using ArrayList and List to manage records.
- Handling user interactions through event listeners.

## Important Note

This project is developed for academic and practical learning purposes. Passwords are stored in plain text in the CSV file. Real-world applications should use secure password hashing and proper authentication mechanisms.

## Author

**Hemanta Mukherjee**

## License

This project is created for educational purposes.