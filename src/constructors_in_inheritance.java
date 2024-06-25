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
        System.out.println("I'm derived once from base class and take only one argument");
    }

    public Derived1(int x,int k){
        super(x);
        this.y = k;
        System.out.println("This constructor takes two arguments");
    }
}

class ChildOfDerived extends Derived1{
    int z;
    ChildOfDerived(int x, int y, int z){
        //System.out.println("Hererere");
        super(x,y);
        this.z = z;
        System.out.println("Calling the child of Derived Constructor");

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
        //Derived1 d1 = new Derived1();
        ChildOfDerived cd1 = new ChildOfDerived(10, 20, 30);
    }
}
