import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int total = 0;

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        double avg = (double) total / size;

        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);

        scanner.close();
    }
}
