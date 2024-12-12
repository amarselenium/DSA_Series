import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/***
 * Created By: AmareshRout
 * Date: 25/10/24
 * Project Name: NagarroTest
 */

public class Timecalculation {
    public static void main(String[] args) {
        System.out.println(timecalulcation("11:00", "11:30"));
    }

    public static double timecalulcation(String str1, String str2)
    {
        LocalTime startTime = LocalTime.parse(str1);
        LocalTime endTime = LocalTime.parse(str2);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println(TimeUnit.MINUTES.toHours(duration.toMinutes()));
        double durationtotal = duration.toMinutes()/60.0;

        return durationtotal;
    }
}
