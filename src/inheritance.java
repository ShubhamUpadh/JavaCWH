class Base{
    int x;
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
}

class Derived extends Base{
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

}

class Animal{
    public Animal() {
    }

    int legs;
    boolean canFly;
    boolean canSwim;
    boolean isHerbivore;

}

class Dog extends Animal{
    public void Bark(){
        System.out.println("Barking");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(15);
        System.out.println(d.getX());

    }
}
