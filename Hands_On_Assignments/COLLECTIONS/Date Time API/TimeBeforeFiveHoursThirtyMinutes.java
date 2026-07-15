import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeBeforeFiveHoursThirtyMinutes {

    public static void main(String[] args) {

        // Current time
        LocalTime currentTime = LocalTime.now();

        // Time before 5 hours and 30 minutes
        LocalTime previousTime = currentTime.minusHours(5).minusMinutes(30);

        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time                : " + currentTime.format(formatter));
        System.out.println("Time Before 5 Hours 30 Mins : " + previousTime.format(formatter));
    }
}
