import java.time.Year;

public class LeapYearCheck {

    public static void main(String[] args) {

        Year currentYear = Year.now();

        if (currentYear.isLeap()) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is not a Leap Year.");
        }
    }
}
