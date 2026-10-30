# String Animation Using Java Swing

## 📌 Project Overview

This project demonstrates a simple **String Animation using Java Swing**. It displays the text `"Welcome to Java"` inside a graphical window and animates it horizontally from left to right.

When the text moves beyond the right edge of the window, it reappears from the left side, creating a continuous animation effect.

The project uses Java Swing, AWT, and Multithreading to implement the animation.

## 🚀 Features

- Displays animated text: **Welcome to Java**.
- Smooth horizontal text movement.
- Automatically restarts animation from the left side.
- Uses a separate thread for animation.
- Provides a graphical user interface using JFrame and JPanel.
- Automatically stops the animation when the window is closed.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **GUI Framework:** Java Swing
- **Graphics Library:** Java AWT
- **Concepts Used:**
    - JPanel and JFrame
    - Graphics and Font
    - Multithreading
    - Runnable Interface
    - Event Handling
    - Exception Handling

## 📂 Project Structure

```text
StringAnimation/
│
├── StringAnimation.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code)
- Command Prompt / Terminal

## ▶️ How to Run

**Step 1: Compile the program**

```bash
javac StringAnimation.java
```

**Step 2: Run the program**

```bash
java StringAnimation
```

## 🖥️ Working of the Program

1. A JFrame window is created with a JPanel.
2. The text `"Welcome to Java"` is displayed in blue color.
3. A separate thread starts the animation.
4. The X-coordinate of the text increases by 10 pixels after every 200 milliseconds.
5. When the text moves beyond the window width, its position resets to the left.
6. The `repaint()` method refreshes the panel to display the updated position.
7. When the window closes, the animation thread is interrupted and stopped.

## 🎯 Learning Outcomes

Through this program, you will understand:

- How to create GUI applications using Java Swing.
- How to draw text using the Graphics class.
- How to implement animation using multithreading.
- How to use the Runnable interface.
- How to handle window events.
- How to use repaint() for graphical updates.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.