abstract class Base2{
    public Base2(){
        System.out.println("Mai base2 ka constructore hu");
    }
    public void sayHello(){
        System.out.println("Hi");
    }
    abstract public void greet();

}

class Child2 extends Base2{
    public void Base2(){
        System.out.println("Hello");
    }
    @Override
    public void greet(){
        System.out.println("Hello");
    }
}

abstract class Child3 extends Base2{
    public void greet(){
        System.out.println("Helleoe");
    }
}

public class abstractClasses {
    public static void main(String[] args) {
    }
}
