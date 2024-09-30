import java.util.Date;

public class dateAndTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/(long) (1000L *60*60*24*365));
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
    }
}
