# Student Registration Portal Using Java Swing

## 📌 Project Overview

The **Student Registration Portal** is a desktop-based application developed using Java Swing. It allows users to register students by entering their personal and academic information through a graphical user interface.

The application collects student details, validates the required fields, and stores registration records in a CSV file (`students.csv`). Users can also view previously saved student registrations.

This project demonstrates GUI development, event handling, file handling, and data storage using Java.

## 🚀 Features

### Student Registration
- Enter student name.
- Enter roll number.
- Enter email address.
- Enter phone number.
- Enter course details.
- Select gender using a dropdown menu.

### Data Management
- Save student records in a CSV file.
- Automatically create CSV headers for a new file.
- Store multiple student registrations.
- View previously registered students.
- Display registration records in a separate dialog.

### Additional Features
- Empty-field validation.
- Clear Form functionality.
- Registration success notifications.
- Error handling for file operations.
- UTF-8 character encoding.
- CSV formatting with proper handling of commas and quotation marks.
- User-friendly graphical interface.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **Data Storage:** CSV File
- **File Handling:** Java I/O
- **Character Encoding:** UTF-8

### Concepts Used
- Object-Oriented Programming
- JFrame and JPanel
- JTextField and JComboBox
- JButton and JLabel
- Event Handling
- Lambda Expressions
- File Handling
- Exception Handling
- CSV Data Management

## 📂 Project Structure

```text
StudentRegistrationPortal/
│
├── StudentRegistrationPortal.java
├── students.csv
└── README.md
```

*Note: The `students.csv` file is automatically created when the first student is registered.*

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above).
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code).
- Command Prompt / Terminal.

## ▶️ How to Run

**Step 1: Compile the Java program**

```bash
javac StudentRegistrationPortal.java
```

**Step 2: Execute the program**

```bash
java StudentRegistrationPortal
```

**Step 3: Register a Student**

1. Enter the student's name.
2. Enter the roll number.
3. Enter the email address.
4. Enter the phone number.
5. Enter the course.
6. Select the gender.
7. Click the **Register** button.

**Step 4: View Registrations**

Click the **View Registrations** button to display all previously saved student records.

## 📊 Sample CSV Output

After registering a student, the application generates a `students.csv` file.

```csv
Name,Roll Number,Email,Phone,Course,Gender
"Hemanta Mukherjee","101","hemanta@example.com","9876543210","B.Tech","Male"
"Rahul Sharma","102","rahul@example.com","9876501234","BCA","Male"
```

## 🔄 Working of the Program

1. The application creates a graphical window using `JFrame`.
2. A `JPanel` with `GridLayout` organizes the registration form.
3. Users enter student information through `JTextField` components.
4. A `JComboBox` allows users to select gender.
5. The Register button triggers the `registerStudent()` method.
6. The program checks whether all required fields are completed.
7. Student information is converted into properly escaped CSV values.
8. Records are appended to `students.csv` using `FileOutputStream`.
9. The View Registrations button reads the CSV file using `BufferedReader`.
10. Previously saved records are displayed inside a `JOptionPane` dialog.
11. The Clear Form button resets all input fields.

## 📚 Important Java Classes Used

| Class | Purpose |
|---|---|
| JFrame | Creates the main application window. |
| JPanel | Organizes form components. |
| JTextField | Accepts student information. |
| JComboBox | Provides gender selection. |
| JButton | Performs registration and other actions. |
| JLabel | Displays field names and status messages. |
| GridLayout | Arranges components in rows and columns. |
| JOptionPane | Displays messages and registration records. |
| File | Represents the CSV file. |
| FileOutputStream | Appends student data to the file. |
| BufferedReader | Reads saved registration records. |
| PrintWriter | Writes formatted CSV records. |

## 🎯 Learning Outcomes

Through this project, you will understand:

- How to develop desktop applications using Java Swing.
- How to design a student registration form.
- How to handle user interactions using ActionListener and lambda expressions.
- How to validate user input.
- How to perform file operations using Java I/O.
- How to store and retrieve data using CSV files.
- How to handle CSV values containing commas and quotation marks.
- How to display information using JOptionPane.
- How to implement basic data management in Java.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.