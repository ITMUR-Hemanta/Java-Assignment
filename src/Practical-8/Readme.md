# Student Registration Form – Java Swing & CSV

## 📌 Project Overview

The **Student Registration Form** is a Java-based desktop application developed using Java Swing. It provides a graphical interface for entering student details and stores the submitted information in a CSV (Comma-Separated Values) file.

The project demonstrates Java GUI development, event handling, input validation, and file handling.

## ✨ Features

- **Student Registration:** Enter student details through a graphical form.
- **Input Fields:** Student Name, Roll Number, Email Address, Phone Number, Course, and Gender.
- **Input Validation:** Checks that all fields are completed before registration.
- **CSV File Storage:** Saves student records in `students.csv`.
- **Automatic CSV Header:** Creates column headings when the CSV file is first created or is empty.
- **View Registrations:** Displays previously saved student records.
- **Clear Form:** Resets all input fields.
- **UTF-8 Support:** Uses UTF-8 encoding for file operations.
- **CSV Formatting:** Handles commas and quotation marks in field values.

## 🛠️ Technologies Used

- Java
- Java Swing
- Java AWT
- File Handling
- CSV File Storage
- IntelliJ IDEA

## 📂 Project Structure

```text
StudentRegistrationForm/
│
├── RegistrationForm.java
├── students.csv          (Created automatically)
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- IntelliJ IDEA or any Java IDE
- Basic knowledge of Java

## ▶️ How to Run

**Step 1:** Clone the repository.

```bash
git clone https://github.com/your-username/StudentRegistrationForm.git
```

**Step 2:** Open the project in IntelliJ IDEA.

**Step 3:** Open `RegistrationForm.java`.

**Step 4:** Compile the program.

```bash
javac RegistrationForm.java
```

**Step 5:** Run the application.

```bash
java RegistrationForm
```

## 📋 Application Workflow

1. Launch the Student Registration Portal.
2. Enter the student's name.
3. Enter the roll number.
4. Enter the email address.
5. Enter the phone number.
6. Enter the course name.
7. Select the gender.
8. Click **Register** to save the information.
9. Click **View Registrations** to display saved records.
10. Click **Clear Form** to reset the fields.

## 📄 CSV File Format

The application automatically creates a file named `students.csv`.

Example:

```csv
Name,Roll Number,Email,Phone,Course,Gender
"Rahul Sharma","101","rahul@gmail.com","9876543210","B.Tech","Male"
"Priya Verma","102","priya@gmail.com","9123456780","BCA","Female"
```

Each registration is appended as a new row, preserving previously saved records.

## 🔍 Concepts Demonstrated

| Concept | Description |
|---|---|
| JFrame | Creates the main application window |
| JPanel | Organizes GUI components |
| JTextField | Accepts user input |
| JComboBox | Provides gender selection |
| JButton | Performs registration and other actions |
| ActionListener | Handles button click events |
| FileOutputStream | Writes data to the CSV file |
| PrintWriter | Writes formatted text |
| BufferedReader | Reads saved records |
| IOException | Handles file-related errors |

## 🎯 Learning Outcomes

- Understanding Java Swing GUI development.
- Working with Java event handling.
- Implementing input validation.
- Reading and writing files in Java.
- Storing structured information in CSV format.
- Understanding basic desktop application development.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📜 License

This project is developed for educational and academic purposes.