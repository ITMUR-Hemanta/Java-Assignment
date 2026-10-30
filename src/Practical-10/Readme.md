# Addition Demo Using JavaBeans

A simple Java application that demonstrates the use of **JavaBeans** to perform the addition of two integers. The program uses a separate JavaBean class to store numbers, perform calculations, and return the result to the main application.

## Project Overview

This project demonstrates how JavaBeans work using private variables, getter and setter methods, a public no-argument constructor, and the `Serializable` interface.

The user enters two integers through the console. The `AdditionDemo` class passes these values to the `AdditionBean` class, which calculates their sum and returns the result.

## Features

- Accepts two integer inputs from the user.
- Uses a separate JavaBean class for data management.
- Implements getter and setter methods.
- Performs addition using a dedicated method.
- Displays the calculated sum.
- Implements the `Serializable` interface.

## Technologies Used

- Java
- JavaBeans
- Scanner Class
- Serializable Interface
- Object-Oriented Programming (OOP)

## Project Structure

```text
AdditionDemo/
│
├── AdditionDemo.java
├── AdditionBean.java
└── README.md
```

## File Description

### 1. AdditionDemo.java

- Contains the `main()` method.
- Accepts two numbers using the `Scanner` class.
- Creates an object of `AdditionBean`.
- Sets the input values using setter methods.
- Calls the `add()` method.
- Displays the result using the getter method.

### 2. AdditionBean.java

- Implements the `Serializable` interface.
- Contains three private integer variables:
    - `number1`
    - `number2`
    - `result`
- Provides a public no-argument constructor.
- Uses getter and setter methods to access and modify data.
- Contains the `add()` method to calculate the sum.

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK 8 or above)
- IntelliJ IDEA or any Java IDE

### Steps

1. Create a Java project in IntelliJ IDEA.
2. Create two Java classes:
    - `AdditionDemo`
    - `AdditionBean`
3. Paste the respective source code into each class.
4. Make sure both files are in the same package.
5. Run `AdditionDemo.java`.
6. Enter the first and second numbers when prompted.
7. The calculated sum will be displayed.

## Sample Output

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

## JavaBean Concepts Used

| Concept | Description |
|---|---|
| Private Variables | Protect the data through encapsulation |
| No-Argument Constructor | Provides a public default constructor |
| Getter Methods | Retrieve private variable values |
| Setter Methods | Modify private variable values |
| Serializable | Allows objects to be serialized |
| Bean Class | Separates data and calculation logic from the main program |

## Learning Outcomes

Through this program, I learned:

- Understanding the concept of JavaBeans.
- Creating and using a separate Bean class.
- Implementing encapsulation using private variables.
- Using getter and setter methods.
- Understanding the purpose of the `Serializable` interface.
- Performing operations using Java objects.
- Separating application logic into different classes.

## Author

**Hemanta Mukherjee**

## License

This project is created for educational and academic practical purposes.