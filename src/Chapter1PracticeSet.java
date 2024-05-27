import java.util.Scanner;

public class Chapter1PracticeSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in subject 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter marks in subject 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter marks in subject 3 : ");
        int c = sc.nextInt();

        System.out.println("The CGPA is " + (float)(a+b+c)/30);
    }
}
