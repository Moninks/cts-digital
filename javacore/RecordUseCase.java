import java.util.List;
import java.util.stream.Collectors;

record Citizen(String fullName, int age) {}

public class RecordUseCase {
    public static void main(String[] args) {
        Citizen c1 = new Citizen("Alex Johnson", 25);
        Citizen c2 = new Citizen("Maria Lopez", 17);
        Citizen c3 = new Citizen("Sam Wright", 34);

        List<Citizen> community = List.of(c1, c2, c3);

        System.out.println("All citizens:");
        community.forEach(System.out::println);

        var adults = community.stream()
            .filter(c -> c.age() >= 18)
            .collect(Collectors.toList());

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
