public class OverloadExample {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 4.3));
        System.out.println("Sum of three integers: " + obj.add(1, 2, 3));
    }
}
