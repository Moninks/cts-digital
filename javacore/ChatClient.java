import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        try (Socket socket = new Socket("localhost", 9090);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to chat server.");
            String input;
            while ((input = userInput.readLine()) != null) {
                writer.println(input);
                System.out.println(serverResponse.readLine());
            }
        }
    }
}
