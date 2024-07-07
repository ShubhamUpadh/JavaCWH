abstract class Pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing");
    }
    @Override
    public void refill(){
        System.out.println("Refilling");
    }
    public void changeNib(){
        System.out.println("Changing Nib");
    }
}

abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface basicAnimal{
    void eat();
    void sleep();
}

class human extends Monkey implements basicAnimal{
    @Override
    public void jump(){
        System.out.println("Jumping");
    }
    @Override
    public void bite(){
        System.out.println("Biting");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class abstractInterfacePractice {
    public static void main(String[] args) {

    }
}
