# Matrix Multiplication in Java

## 📌 Project Overview

This project demonstrates **Matrix Multiplication using Java**. It takes two matrices as input from the user, checks whether multiplication is possible, calculates their product, and displays the resulting matrix.

The program uses **2D arrays**, **nested loops**, and **BufferedReader** for input handling.

## 🚀 Features

- Accepts two matrices from the user.
- Supports matrices up to `10 × 10`.
- Checks whether matrix multiplication is possible.
- Validates matrix dimensions.
- Calculates the product using nested `for` loops.
- Displays the resultant matrix in tabular format.
- Uses `BufferedReader` for efficient input handling.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Input Handling:** BufferedReader
- **Concepts Used:**
    - Two-Dimensional Arrays
    - Nested For Loops
    - Conditional Statements
    - Matrix Operations
    - Exception Handling

## 📂 Project Structure

```text
MatrixMultiplication/
│
├── MatrixMultiplication.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- Any Java IDE or text editor
- Command Prompt / Terminal

## ▶️ How to Run

**Step 1: Compile the Java program**

```bash
javac MatrixMultiplication.java
```

**Step 2: Execute the program**

```bash
java MatrixMultiplication
```

## 📥 Sample Input

```text
Enter rows and columns of first matrix:
2
2
Enter rows and columns of second matrix:
2
2
Enter elements of first matrix:
1
2
3
4
Enter elements of second matrix:
5
6
7
8
```

## 📤 Sample Output

```text
Product of the matrices:
19    22
43    50
```

## 🧮 Matrix Multiplication Logic

Matrix multiplication is possible only when:

**Number of columns in the first matrix = Number of rows in the second matrix.**

If:

- Matrix A has dimensions `r1 × c1`.
- Matrix B has dimensions `r2 × c2`.

Then the resultant matrix C will have dimensions:

`r1 × c2`

### Mathematical Formula

\[
C[i][j] = \sum_{k=0}^{c1-1} A[i][k] \times B[k][j]
\]

The program uses three nested loops:

1. The outer loop iterates through the rows of the first matrix.
2. The second loop iterates through the columns of the second matrix.
3. The innermost loop calculates the sum of products of corresponding elements.

## 📏 Limitations

- Maximum matrix size is `10 × 10`.
- Only integer values are supported.
- Matrix dimensions must be positive.
- Multiplication requires compatible matrix dimensions.

## 🎯 Learning Outcomes

Through this program, you can understand:

- How to declare and initialize 2D arrays in Java.
- How matrix multiplication works mathematically.
- How nested loops perform multidimensional operations.
- How to validate user input and matrix dimensions.
- How to implement mathematical operations using Java.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.