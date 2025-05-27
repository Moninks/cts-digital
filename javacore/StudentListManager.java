import java.util.ArrayList;
import java.util.Scanner;

public class StudentListManager {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.println("Enter student names (type 'exit' to stop):");

        while (true) {
            String enteredName = nameScanner.nextLine();
            if (enteredName.equalsIgnoreCase("exit")) break;
            studentNames.add(enteredName);
        }

        System.out.println("Student List:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        nameScanner.close();
    }
}
