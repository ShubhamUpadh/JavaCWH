interface Bicycle{
    int speed = 10;
    void speedup(int inc);
    void applyBrake(int dec);
}
interface Horns{
    void k3ghorn();
    void kfpHorn();
}
class avonCycle implements Bicycle, Horns{
    int speed;

    @Override
    public void applyBrake(int dec) {
        this.speed -= dec;
    }

    @Override
    public void speedup(int inc) {
        this.speed += inc;
    }

    @Override
    public void k3ghorn(){
        System.out.println("Hello");
    }

    @Override
    public void kfpHorn(){
        System.out.println("Hi");
    }
}

public class interfaceVsAbstractClass {
    public static void main(String[] args) {
        avonCycle c1 = new avonCycle();
        c1.speedup(100);
        System.out.println(c1.speed);
    }
}
