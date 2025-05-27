import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(9090)) {
            System.out.println("Server is waiting for clients...");
            try (Socket clientSocket = serverSocket.accept();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                 PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

                System.out.println("Client connected.");
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Client says: " + line);
                    writer.println("Server received: " + line);
                }
            }
        }
    }
}
