import java.util.HashMap;
import java.util.Scanner;

public class StudentIDMapper {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student ID and name pairs (enter -1 to stop):");

        while (true) {
            System.out.print("Student ID: ");
            int id = inputScanner.nextInt();
            if (id == -1) break;
            inputScanner.nextLine();  // Consume newline
            System.out.print("Student Name: ");
            String name = inputScanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = inputScanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }

        inputScanner.close();
    }
}
