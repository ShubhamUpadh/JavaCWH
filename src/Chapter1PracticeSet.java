import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter1PracticeSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter marks in subject 1 : ");
//        int a = sc.nextInt();
//        System.out.println("Enter marks in subject 2 : ");
//        int b = sc.nextInt();
//        System.out.println("Enter marks in subject 3 : ");
//        int c = sc.nextInt();
//
//        System.out.println("The CGPA is " + (float)(a+b+c)/30);
//        System.out.println("What is your name ? ");
//        String nm = sc.nextLine();
//
//        System.out.println("Hello " + nm +", have a good day ");
        System.out.println("I will tell if the number is an integer or not \nEnter an input ");
        boolean a  = sc.hasNextInt();
        System.out.println(a);
    }
}
