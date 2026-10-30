# Scientific Calculator Using Java AWT

## 📌 Project Overview

This project is a **Scientific Calculator developed using Java AWT (Abstract Window Toolkit)**. It provides a graphical user interface that allows users to perform basic arithmetic calculations as well as advanced scientific operations.

The calculator supports trigonometric functions, logarithms, square roots, factorials, powers, and mathematical constants such as π (Pi) and e.

It also provides DEG/RAD mode switching for trigonometric calculations.

## 🚀 Features

### Basic Arithmetic Operations
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)

### Scientific Operations
- Sine (sin)
- Cosine (cos)
- Tangent (tan)
- Inverse Sine (asin)
- Inverse Cosine (acos)
- Inverse Tangent (atan)
- Square Root (√)
- Cube Root (∛)
- Square (x²)
- Reciprocal (1/x)
- Power (x^y)
- Logarithm (log)
- Natural Logarithm (ln)
- Factorial (!)

### Additional Features
- DEG/RAD mode switching.
- Mathematical constants π and e.
- Decimal number support.
- Clear (C) functionality.
- Division-by-zero error handling.
- Invalid mathematical operation handling.
- Graphical user interface.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **GUI Framework:** Java AWT
- **Layout Managers:** BorderLayout and GridLayout
- **Event Handling:** ActionListener
- **Concepts Used:**
    - Object-Oriented Programming
    - Inheritance
    - Interfaces
    - Event Handling
    - Exception Handling
    - Mathematical Functions
    - GUI Development

## 📂 Project Structure

```text
ScientificCalculator/
│
├── Calculator.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code)
- Command Prompt / Terminal

## ▶️ How to Run

**Step 1: Compile the program**

```bash
javac Calculator.java
```

**Step 2: Execute the program**

```bash
java Calculator
```

## 🧮 Working of the Program

1. The calculator window is created using the Java AWT Frame class.
2. A TextField is used to display numbers and calculation results.
3. Buttons are created using the Button class and arranged with GridLayout.
4. ActionListener detects button clicks and performs the corresponding operation.
5. Arithmetic operations are processed using a switch statement.
6. Scientific calculations use Java's built-in Math class.
7. DEG/RAD mode controls the angle unit used in trigonometric calculations.
8. Exception handling displays `"Math Error"` for invalid mathematical operations.

## 📐 Mathematical Functions

| Operation | Mathematical Expression |
|---|---|
| Addition | a + b |
| Subtraction | a - b |
| Multiplication | a × b |
| Division | a ÷ b |
| Sine | sin(x) |
| Cosine | cos(x) |
| Tangent | tan(x) |
| Square Root | √x |
| Cube Root | ∛x |
| Square | x² |
| Reciprocal | 1/x |
| Power | xʸ |
| Factorial | x! |
| Logarithm | log₁₀(x) |
| Natural Log | ln(x) |

## 🎯 Learning Outcomes

Through this project, you will understand:

- How to develop GUI applications using Java AWT.
- How to create buttons, frames, panels, and text fields.
- How to implement ActionListener for event handling.
- How to use Java's Math class for scientific calculations.
- How to implement arithmetic and trigonometric operations.
- How to handle mathematical errors using exception handling.
- How to apply Object-Oriented Programming concepts in Java.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.