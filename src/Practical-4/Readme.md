# Client-Server Communication Using Java

## 📌 Project Overview

This project demonstrates **Client-Server Communication using Java Socket Programming**. It establishes a connection between a client and a server using TCP (Transmission Control Protocol).

The client sends a message `"Hello Server!"` to the server, and the server responds with `"Hello Client, message received!"`.

The project demonstrates the fundamentals of networking, socket programming, and data exchange between two applications.

## 🚀 Features

- Establishes communication between client and server.
- Uses TCP socket connections.
- Client sends messages to the server.
- Server receives and displays client messages.
- Server sends a response back to the client.
- Uses input and output streams for data transfer.
- Handles communication errors using exception handling.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Networking:** Java Socket Programming
- **Protocol:** TCP (Transmission Control Protocol)
- **Input Handling:** BufferedReader
- **Output Handling:** PrintWriter
- **Concepts Used:**
    - Client-Server Architecture
    - Socket Programming
    - ServerSocket
    - InputStream and OutputStream
    - Exception Handling

## 📂 Project Structure

```text
ClientServer/
│
├── Client.java
├── Server.java
└── README.md
```

## ⚙️ Requirements

- Java Development Kit (JDK 8 or above)
- Java IDE (Eclipse, IntelliJ IDEA, or VS Code)
- Command Prompt / Terminal
- Two terminal windows for running the client and server.

## ▶️ How to Run

**Step 1: Compile both Java files**

```bash
javac Server.java Client.java
```

**Step 2: Start the server**

Open the first terminal and execute:

```bash
java Server
```

Server output:

```text
Server is waiting for client...
```

**Step 3: Start the client**

Open a second terminal and execute:

```bash
java Client
```

## 📤 Sample Output

### Server Side

```text
Server is waiting for client...
Client connected.
Message from client: Hello Server!
```

### Client Side

```text
Message from server: Hello Client, message received!
```

## 🔄 Working of the Program

1. The server creates a `ServerSocket` on port `5000`.
2. The server waits for an incoming client connection using `accept()`.
3. The client creates a `Socket` and connects to `localhost` on port `5000`.
4. Once connected, the client sends `"Hello Server!"` using `PrintWriter`.
5. The server receives the message using `BufferedReader`.
6. The server displays the received message.
7. The server sends a response to the client.
8. The client receives and displays the server's response.
9. Both client and server close their socket connections.

## 🌐 Networking Concepts

| Component | Description |
|---|---|
| Socket | Establishes communication between client and server. |
| ServerSocket | Listens for incoming client connections. |
| localhost | Refers to the local computer (127.0.0.1). |
| Port 5000 | Communication endpoint used by the application. |
| TCP | Provides reliable, connection-oriented communication. |
| BufferedReader | Reads incoming text data. |
| PrintWriter | Sends text data through the socket. |

## 🎯 Learning Outcomes

Through this project, you will understand:

- How client-server architecture works.
- How to establish network connections using Java.
- How to use Socket and ServerSocket classes.
- How TCP communication works.
- How to send and receive messages over a network.
- How to use input and output streams.
- How to handle networking errors using IOException.

## 👨‍💻 Author

**Hemanta Mukherjee**

## 📄 License

This project is created for educational and academic purposes. Feel free to study and modify the code for learning.