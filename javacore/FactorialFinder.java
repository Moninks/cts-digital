import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int num = input.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
        input.close();
    }
}
