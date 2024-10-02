import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregorianClass {
    public static void main(String[] args) {

        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.getTime());
        System.out.println();
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2019));
    }
}
