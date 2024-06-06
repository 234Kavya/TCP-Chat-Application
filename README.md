

This project is a simple TCP-based chat application implemented in Java. It consists of two main components: a server program and a client program.

## How to Run

### 1. Compile Java Files
First, compile the Java files using the Java compiler (javac):

```javac Server.java
javac Client.java
```

arduino
Copy code

### 2. Run the Server
Run the server program by executing the `Server` class:

java Server

csharp
Copy code

You should see a message indicating that the server is listening on port 5000.

### 3. Run the Client
Open another terminal or command prompt window, and run the client program by executing the `Client` class:

java Client

sql
Copy code

You should see a message indicating that the client is connected to the server.

### 4. Start Chatting
Now, you can start typing messages in the client window. Each message will be sent to the server and displayed in the server window. Similarly, messages from the server will be displayed in the client window. To end the conversation, type "bye" in either the client or server window.

## Notes
- Make sure both the server and client are running on the same machine or reachable over the network.
- You can modify the code to change the port number or handle multiple clients concurrently.
