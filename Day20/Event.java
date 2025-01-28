package DateAndTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class Event {
    public static void main(String[] args) {
        List<DateTime> events = List.of(
                new DateTime("Meeting", LocalDateTime.of(2025, 1, 28, 8, 0), Duration.ofHours(1)),
                new DateTime("Workshop", LocalDateTime.of(2025, 1, 28, 14, 0), Duration.ofHours(2))
        );
        LocalDate date = LocalDate.of(2025, 1, 28);
        List<DateTime> filter = events
                .stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
        System.out.println(" Events on " + date + ":");
        filter.forEach(event -> System.out.println(event.getName()));
        System.out.println(" ");
            Duration duration = Duration.between(events.get(0).getDateTime(), events.get(1).getDateTime());
            System.out.println("Duration between first two events: " + duration.toHours() + "hours");
    }
}