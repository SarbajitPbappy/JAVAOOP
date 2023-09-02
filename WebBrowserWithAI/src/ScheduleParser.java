import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScheduleParser {

    public List<BusSchedule> parseSchedulesFromFile(File pdfFile) throws IOException {
        List<BusSchedule> schedules = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(pdfFile))) {
            String line;
            String timePattern = "\\d{1,2}(?:\\:\\d{2})?(?:\\s*[ap]m)?"; // Matches time formats
            Pattern pattern = Pattern.compile("(" + timePattern + ")\\s*(.*?)\\s*(\\d+)");
            
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String time = matcher.group(1);
                    String route = matcher.group(2).trim();
                    int busNumber = Integer.parseInt(matcher.group(3));
                    schedules.add(new BusSchedule(time, route, busNumber));
                }
            }
        }
        
        // Sort schedules based on bus name, time, and number
        Collections.sort(schedules, Comparator
                .comparing(BusSchedule::getBusName)
                .thenComparing(BusSchedule::getDepartureTime)
                .thenComparingInt(BusSchedule::getBusNumber));
        
        return schedules;
    }
}
