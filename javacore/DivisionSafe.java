import java.util.Scanner;

public class DivisionSafe {
    public static void main(String[] args) {
        Scanner divisorScanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = divisorScanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = divisorScanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Error: Cannot divide by zero.");
        }

        divisorScanner.close();
    }
}
