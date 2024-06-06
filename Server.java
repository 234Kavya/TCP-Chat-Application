import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server listening on port 5000...");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket);

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

        String inputLine, outputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println("Client: " + inputLine);
            if (inputLine.equals("bye"))
                break;

            System.out.print("Server: ");
            outputLine = consoleInput.readLine();
            out.println(outputLine);
            if (outputLine.equals("bye"))
                break;
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}
