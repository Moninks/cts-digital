import java.util.Scanner;

public class MirrorStringChecker {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = readInput.nextLine();

        String filtered = userInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(filtered).reverse().toString();

        if (filtered.equals(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        readInput.close();
    }
}
