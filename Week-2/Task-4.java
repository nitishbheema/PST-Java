import java.util.*;
import java.util.stream.*;

public class PersonStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            persons.add(new Person(sc.next(), sc.nextInt()));
        }

        int ageLimit = sc.nextInt();

        // Sorted names
        persons.stream()
                .map(p -> p.name)
                .sorted(String::compareTo)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // Filter by age (static method reference)
        persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(p -> p.name)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // Uppercase (instance method reference)
        persons.stream()
                .map(p -> p.name)
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
    }
}
