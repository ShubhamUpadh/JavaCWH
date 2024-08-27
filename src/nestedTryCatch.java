import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        sol();
//        int[] marks = {1,2,3,4,5};
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Hello welcome to this video");
//            try {
//                System.out.println(marks[10]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Index out of bounds");
//                System.out.println("Exception @ level 2");
//            }
//        }
//        catch (Exception e){
//            System.out.println("Exception @ level 1");
//        }
    }
    static void sol(){
        int[] marks = {1,2,3,4,5,6,7};
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                System.out.println(marks[n]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }
}
