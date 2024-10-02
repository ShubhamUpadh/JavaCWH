import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

    static void duplicateSets(){
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Enter an integer value");
            int val = sc.nextInt();
            s.add(val);
            al.add(val);
        }

        System.out.println(s);
        System.out.println(al);

    }

    public static void main(String[] args) {
        //ques1();
        //System.out.println(timeFormat());
        duplicateSets();
    }
}
