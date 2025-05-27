import java.util.Scanner;

public class RecursiveFibonacci {

    public static int fib(int term) {
        if (term <= 1)
            return term;
        return fib(term - 1) + fib(term - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int position = scanner.nextInt();

        int result = fib(position);
        System.out.println("Fibonacci number at position " + position + " is: " + result);

        scanner.close();
    }
}
