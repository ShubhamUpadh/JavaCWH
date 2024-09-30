import java.util.Calendar;
import java.util.TimeZone;

public class calenderClass {
    public static void main(String[] args) {
//        Calendar newCal = Calendar.getInstance();
//        System.out.println(newCal.getCalendarType());
//        System.out.println(newCal.getTimeZone());
//        System.out.println();
        TimeZone tz = TimeZone.getDefault();
        tz.setID("GMT - 07:00");
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        System.out.println(c.getTimeZone());

    }
}
