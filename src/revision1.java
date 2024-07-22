import java.util.Scanner;

class base133{
    public base133(){
        System.out.println("Base1 Constructor has been invoked");
    }
    public base133(int x){
        System.out.println(x);
    }
}
class child1 extends base133{
    public child1(){
        super(10);
        System.out.println("child1 constructor has been invoked");
    }
}

public class revision1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//        System.out.printf("Value of a is %s and b is %s",a,b);
        child1 ch1 = new child1();

    }
}
