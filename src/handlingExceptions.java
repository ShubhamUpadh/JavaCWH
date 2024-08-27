import java.util.Scanner;

public class handlingExceptions {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 12;
        marks[2] = 14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index ");
        int n = sc.nextInt();
        System.out.println("Enter the number by which to divide ");
        int div = sc.nextInt();
        try{

            System.out.println(marks[n]/div);
            System.out.println(marks[n]);
        }
        catch (ArithmeticException k){
            System.out.println(k);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
