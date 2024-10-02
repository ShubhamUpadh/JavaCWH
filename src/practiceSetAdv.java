import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class practiceSetAdv {
    static ArrayList<String > ques1(){
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Enter the name of student # " +  i + 1 );
            String name = sc.nextLine();
            al.add(name);
        }

        for (String name : al){
            System.out.println(name);
        }
        return al;
    }

    static String timeFormat(){
        LocalTime d = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s:a");
        return d.format(df);
    }



    public static void main(String[] args) {
        //ques1();
        System.out.println(timeFormat());
    }
}
