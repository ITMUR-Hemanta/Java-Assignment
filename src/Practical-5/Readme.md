# Notepad Application Using Java Swing

## 📌 Project Overview

This project is a simple **Notepad Application developed using Java Swing**. It provides a graphical text editor that allows users to create, open, edit, and save text files.

The application offers basic text-editing features similar to the traditional Windows Notepad, including file management, clipboard operations, and word wrapping.

It uses Java Swing components to create the graphical user interface and Java I/O classes to handle file operations.

## 🚀 Features

### File Operations
- **New:** Create a new text document.
- **Open:** Open existing text files.
- **Save:** Save changes to the current file.
- **Save As:** Save the document with a new filename or location.
- **Exit:** Close the application with a confirmation prompt.

### Editing Operations
- Cut selected text.
- Copy selected text.
- Paste copied text.
- Select all text.

### Formatting Options
- Word Wrap functionality.
- Automatic line wrapping.
- Word-based line wrapping.
- Scrollable text editing area.
- Custom font size and style.

### Additional Features
- File name displayed in the window title.
- Confirmation before discarding existing text.
- Error handling for file operations.
- User-friendly graphical interface.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **Layout Manager:** BorderLayout
- **Text Editor:** JTextArea
- **File Handling:** Java I/O
- **Event Handling:** ActionListener and WindowAdapter

### Concepts Used
- Object-Oriented Programming
- Inheritance
- Interfaces
- Event Handling
- Exception Handling
- File Handling
- GUI Development

## 📂 Project Structure

```text
Notepad/
│
├── Notepad.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above).
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code).
- Command Prompt / Terminal.

## ▶️ How to Run

**Step 1: Compile the Java program**

```bash
javac Notepad.java
```

**Step 2: Execute the program**

```bash
java Notepad
```

## 🖥️ Working of the Program

1. The application creates a main window using `JFrame`.
2. A `JTextArea` provides the main text-editing area.
3. A `JScrollPane` allows users to navigate through longer documents.
4. A `JMenuBar` contains three menus: File, Edit, and Format.
5. The File menu handles creating, opening, saving, and exiting documents.
6. The Edit menu provides cut, copy, paste, and select-all operations.
7. The Format menu provides the Word Wrap option.
8. `JFileChooser` allows users to select files and save locations.
9. `BufferedReader` and `BufferedWriter` handle reading and writing text files.
10. `JOptionPane` displays confirmation messages and error dialogs.

## 📚 Java Classes Used

| Class | Purpose |
|---|---|
| JFrame | Creates the main application window. |
| JTextArea | Provides the text-editing area. |
| JMenuBar | Creates the menu bar. |
| JMenuItem | Creates menu options. |
| JFileChooser | Opens and saves files. |
| JScrollPane | Adds scrolling functionality. |
| JOptionPane | Displays dialogs and messages. |
| BufferedReader | Reads text files. |
| BufferedWriter | Writes text files. |
| ActionListener | Handles menu actions. |
| WindowAdapter | Handles window-closing events. |

## 🎯 Learning Outcomes

Through this project, you will understand:

- How to develop desktop applications using Java Swing.
- How to create menus and menu items.
- How to implement file handling in Java.
- How to read and write text files.
- How to handle user actions using ActionListener.
- How to use JFileChooser for file selection.
- How to implement clipboard operations.
- How to manage window events and confirmation dialogs.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.