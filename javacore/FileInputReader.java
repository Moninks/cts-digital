import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputReader {
    public static void main(String[] args) {
        try {
            BufferedReader readerObj = new BufferedReader(new FileReader("output.txt"));
            String currentLine;

            System.out.println("Contents of output.txt:");
            while ((currentLine = readerObj.readLine()) != null) {
                System.out.println(currentLine);
            }

            readerObj.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
