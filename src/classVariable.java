class newClass{
    public static int a = 10;
    public int method1(){
        System.out.println("Initialised");
        return 10;
    }
}
public class classVariable {
    public static void main(String[] args) {
        newClass obj1 = new newClass();
        newClass.a = 100;
        newClass obj2 = new newClass();

        newClass obj3 = new newClass();


    }
}
