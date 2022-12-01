import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String DayNumber = today.getDayOfWeek().toString();
        String FullMonthName = today.getMonth().name();
        int last2DigitsOfYearNumber =  today.getYear() - 2000;

        int hourTime = LocalDateTime.now().getHour();
        int minuteTime = LocalDateTime.now().getMinute();

        LocalDateTime time = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        DateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmm'Z'");

        String zonedDateTime = isoFormat.format(new Date());
        isoFormat.setTimeZone(timeZone);
        System.out.println(zonedDateTime);
    }
}
