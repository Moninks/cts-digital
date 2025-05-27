import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("Pineapple");
        fruitBasket.add("Mango");
        fruitBasket.add("Apple");
        fruitBasket.add("Banana");
        fruitBasket.add("Cherry");

        Collections.sort(fruitBasket, (str1, str2) -> str1.compareToIgnoreCase(str2));

        System.out.println("Sorted fruits: " + fruitBasket);
    }
}
