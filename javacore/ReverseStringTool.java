import java.util.Scanner;

public class ReverseStringTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();

        System.out.println("Reversed string: " + reversed.toString());

        sc.close();
    }
}
