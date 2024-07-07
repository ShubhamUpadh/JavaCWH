interface Camera{
    void takePic();
    void recordVid();
}

interface GPS{
    void returnCoordinates();
}

class smartPhone2 implements Camera, GPS{
    @Override
    public void takePic(){
        System.out.println(10);
    }
    @Override
    public void recordVid(){
        System.out.println(11);
    }
    @Override
    public void returnCoordinates(){
        System.out.println(1313);
    }
}

public class polymorphismUsingInterfaces {
    public static void main(String[] args) {
        GPS g = new smartPhone2();
        g.returnCoordinates();
    }
}
