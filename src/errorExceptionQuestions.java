import java.util.Scanner;

public class errorExceptionQuestions {
    public static void main(String[] args) {
        ques2(true);
    }
    public static int ques1(){
//        // Syntax
//        init a = 5;
//        //Logical
//        int a = 10;
//        int b = 102;
//        int sum = a -b;
//        //Runtime
//        int c = 10/0;
//
        return 5;
    }
    public static void ques2(boolean a){
//        if (a){
//            int b = 10, c= 0;
//            try{
//                System.out.println(b/c);
//            }
//            catch (ArithmeticException e){
//                System.out.println("Haha");
//            }
//        }
//        else {
//            try {
//                int c = ques1(10);
//            }
//            catch (IllegalArgumentException e){
//                System.out.println("Hehe");
//            }
//        }
    }
    public static void ques3(){
        int[] marks = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            try {
                int a = sc.nextInt();
                System.out.println(marks[a]);
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Error");
            }

        }

    }
}
