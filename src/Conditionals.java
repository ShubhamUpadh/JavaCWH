import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        //int age = 6;
        Scanner age = new Scanner(System.in);
        int ageVal = age.nextInt();
        if(ageVal>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("No, not yet");
        }
        boolean a = true, b = false;
        if(a &&b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
    }
}
