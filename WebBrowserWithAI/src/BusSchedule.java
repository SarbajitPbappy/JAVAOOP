import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BusSchedule {

    private String busName;
    private LocalDateTime departureTime;
    private int busNumber;

    public BusSchedule(String time, String route, int busNumber) {
        this.departureTime = parseTime(time);
        this.busName = route;
        this.busNumber = busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public int getBusNumber() {
        return busNumber;
    }

   private LocalDateTime parseTime(String time) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        return LocalDateTime.parse(time, timeFormatter);
    }

    // Other relevant methods
}
