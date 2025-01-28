package DateAndTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;

class DateTime {
    private String name;
    private LocalDateTime dateTime;
    private Duration duration;

    public DateTime(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Duration getDuration() {
        return duration;
    }
}
