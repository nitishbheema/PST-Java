import java.util.*;
import java.time.*;
import java.util.stream.*;

public class EventProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new Event(
                sc.next(),
                LocalDate.parse(sc.next())
            ));
        }

        int month = sc.nextInt();

        // Sort chronologically
        events.stream()
                .sorted(Comparator.comparing(e -> e.date))
                .forEach(e -> System.out.print(e.name + " "));
        System.out.println();

        // Earliest event
        Event earliest = events.stream()
                .min(Comparator.comparing(e -> e.date))
                .get();
        System.out.println(earliest.name);

        // Latest event
        Event latest = events.stream()
                .max(Comparator.comparing(e -> e.date))
                .get();
        System.out.println(latest.name);

        // Events in given month
        events.stream()
                .filter(e -> e.date.getMonthValue() == month)
                .forEach(e -> System.out.print(e.name + " "));
    }
}
