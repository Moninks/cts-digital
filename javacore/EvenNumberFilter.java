import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static void main(String[] args) {
        List<Integer> numberPool = Arrays.asList(12, 17, 19, 20, 33, 42, 44, 57);

        List<Integer> evensOnly = numberPool.stream()
            .filter(num -> num % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Even numbers: " + evensOnly);
    }
}
