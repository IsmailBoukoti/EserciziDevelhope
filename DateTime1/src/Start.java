import java.time.LocalDate;
import java.time.Year;

public class Start {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int day = date.lengthOfMonth() - date.getDayOfMonth();
        System.out.println("There are " + day + " days left to the end of the month");

        int currentYear = date.getYear();
        int daysLeft = date.lengthOfYear() - date.getDayOfYear();
        System.out.println("There are " + daysLeft + " days left to the end of the year");
    }
}
