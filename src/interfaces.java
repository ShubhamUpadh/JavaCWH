interface cycle{
    void applybrake(int x);
    void speedup(int y);
}

class HeroCycle implements cycle{
    int speed;
    public HeroCycle(int speed){
        this.speed = speed;
    }
    @Override
    public void applybrake(int decrement){
        this.speed -= decrement;
    }
    @Override
    public void speedup(int increment){
        this.speed += increment;
    }
}

public class interfaces {
}
