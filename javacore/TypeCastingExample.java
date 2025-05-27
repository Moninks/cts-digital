public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleVal = 9.78;
        int intVal = (int) doubleVal; // Narrowing casting

        int score = 100;
        double convertedScore = score; // Widening casting

        System.out.println("Original double: " + doubleVal);
        System.out.println("Double to int (casted): " + intVal);
        System.out.println("Original int: " + score);
        System.out.println("Int to double (casted): " + convertedScore);
    }
}
