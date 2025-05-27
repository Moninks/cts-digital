public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;         // 10 + (5*2) = 20
        int result2 = (10 + 5) * 2;       // (10+5) * 2 = 30
        int result3 = 100 / 5 + 2 * 3;    // (100/5) + (2*3) = 20 + 6 = 26

        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("100 / 5 + 2 * 3 = " + result3);

        // Explanation:
        System.out.println("\nOperator precedence: *, / have higher precedence than +, -");
    }
}
