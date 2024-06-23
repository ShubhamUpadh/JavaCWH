class Base1{
    int x;
    public Base1(){
        System.out.println("I'm a base constructor");
    }

    Base1(int x){
        this.x = x;
        System.out.println("The value of x is " + this.x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    public int y;

    public Derived1(){
        super(10);
        System.out.println("I'm derived once from base class");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
//
//class Derived2 extends Derived1{
//    int z;
//    Derived2(){
//        System.out.println("This is derived from derived1");
//    }
//}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        //Base1  b1 = new Base1();
        Derived1 d1 = new Derived1();
    }
}
