import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputWriter {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);

        System.out.print("Enter text to write to file: ");
        String content = textScanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Content written to output.txt successfully.");
        } catch (IOException ioe) {
            System.out.println("An error occurred: " + ioe.getMessage());
        }

        textScanner.close();
    }
}
