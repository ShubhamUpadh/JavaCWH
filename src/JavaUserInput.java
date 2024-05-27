import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner s = new Scanner(System.in);
////        System.out.print("Enter number 1 : ");
////        float a = s.nextFloat();
////        System.out.println("Enter number 2 : ");
//        float b = s.nextFloat();
//        float sum = a + b;
//        System.out.println("The sum of these numbers us ");
//        System.out.println(sum);
//        System.out.println("Here");
//        boolean b1 = s.hasNextFloat();
//        System.out.print(b1);
//        System.out.println("Here1");
        System.out.println("Take a string as input :");
        String f = s.next();
        System.out.println("Output of next() "+ f);
        s.nextLine();
        String g = s.nextLine();
        System.out.println(g);
        s.close();
//        String str = s.nextLine();
//        System.out.println(str);
    }
}
