import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {

    public static void main(String[] args) {

        // Enter your joining date
        LocalDate joiningDate = LocalDate.of(2023, 5, 10);

        // Today's date
        LocalDate today = LocalDate.now();

        // Calculate experience
        Period experience = Period.between(joiningDate, today);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);
        System.out.println("Experience   : "
                + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, "
                + experience.getDays() + " Days");
    }
}
