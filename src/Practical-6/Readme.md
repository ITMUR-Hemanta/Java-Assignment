# Remote Calculator Using Java RMI

## 📌 Project Overview

This project demonstrates a **Remote Calculator using Java Remote Method Invocation (RMI)**. It allows a client application to perform mathematical operations on a remote server through network communication.

The server provides calculator services, while the client remotely invokes methods to perform addition, subtraction, and multiplication.

Java RMI enables communication between Java applications running on the same or different computers.

## 🚀 Features

- Remote method invocation using Java RMI.
- Client-server communication.
- Addition of two integers.
- Subtraction of two integers.
- Multiplication of two integers.
- Remote object registration and lookup.
- Uses Java RMI Registry on port `1099`.
- Exception handling for remote communication errors.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Technology:** Java RMI (Remote Method Invocation)
- **Networking:** Java Remote Communication
- **Registry Port:** 1099

### Concepts Used

- Remote Interface
- Remote Object
- UnicastRemoteObject
- RMI Registry
- Remote Method Invocation
- Client-Server Architecture
- Exception Handling
- Object-Oriented Programming

## 📂 Project Structure

```text
RemoteCalculator/
│
├── RemoteCalculator.java
├── CalculatorImpl.java
├── RMIServer.java
├── RMIClient.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above).
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code).
- Command Prompt / Terminal.
- Network connectivity between client and server (if running on different computers).

## ▶️ How to Run

### Step 1: Compile all Java files

```bash
javac *.java
```

### Step 2: Start the RMI Server

Open the first terminal and execute:

```bash
java RMIServer
```

Server Output:

```text
RMI Server is running...
Calculator Service is ready.
```

The server creates an RMI Registry on port `1099` and registers the calculator service.

### Step 3: Run the RMI Client

Open a second terminal and execute:

```bash
java RMIClient
```

## 📤 Sample Output

### Client Side

```text
First Number: 20
Second Number: 10
Addition: 30
Subtraction: 10
Multiplication: 200
```

### Server Side

```text
RMI Server is running...
Calculator Service is ready.
```

## 🔄 Working of the Program

1. **RemoteCalculator.java:** Defines the remote interface containing addition, subtraction, and multiplication methods.
2. **CalculatorImpl.java:** Implements the remote interface and extends `UnicastRemoteObject` to make the object available for remote calls.
3. **RMIServer.java:** Creates the RMI Registry on port `1099` and registers the remote calculator object using `rebind()`.
4. **RMIClient.java:** Looks up the registered calculator service using `Naming.lookup()`.
5. The client calls remote methods through the returned remote object reference.
6. The server executes the requested mathematical operations.
7. The calculated results are returned to the client and displayed on the console.

## 📚 Important Java RMI Classes and Methods

| Class / Method | Purpose |
|---|---|
| Remote | Marks an interface for remote access. |
| RemoteException | Handles remote communication errors. |
| UnicastRemoteObject | Exports remote objects. |
| LocateRegistry | Creates or accesses an RMI Registry. |
| Registry | Maintains registered remote objects. |
| Naming.lookup() | Locates a remote object. |
| Registry.rebind() | Registers or replaces a remote object. |

## 🎯 Learning Outcomes

Through this project, you will understand:

- The fundamentals of Java Remote Method Invocation.
- How to create and implement remote interfaces.
- How to establish communication between remote Java applications.
- How to create and use an RMI Registry.
- How to register and locate remote objects.
- How to invoke methods on remote objects.
- How to handle RemoteException in distributed applications.
- How client-server architecture works in distributed computing.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.