class cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getRadius(){
        return this.radius;
    }
    public int getHeight(){
        return this.height;
    }

    public double surfaceArea(){
        return 2*3.14*this.radius*this.height;
    }

    public double volume(){
        return 3.14 * this.radius * this.radius * this.height;
    }

    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
}

public class constructorsPractice {
}
