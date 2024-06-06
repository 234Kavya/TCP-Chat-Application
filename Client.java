import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 5000);
        System.out.println("Connected to server...");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

        String inputLine, outputLine;

        while (true) {
            System.out.print("Client: ");
            outputLine = consoleInput.readLine();
            out.println(outputLine);
            if (outputLine.equals("bye"))
                break;

            inputLine = in.readLine();
            System.out.println("Server: " + inputLine);
            if (inputLine.equals("bye"))
                break;
        }

        out.close();
        in.close();
        clientSocket.close();
    }
}

