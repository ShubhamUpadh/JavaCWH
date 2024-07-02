class circle{
    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
    public circle(int radius){
        this.radius = radius;
    }
    public double circleArea(){
        return 3.14 * radius * radius;
    }

    public int getRadius(){
        return this.radius;
    }
}

class cylinders extends circle{
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
    public cylinders(int radius, int height){
        super(radius);
        this.height = height;
    }

    public double volume(){
        return height * circleArea();
    }

    public double area(){
        return circleArea() * 2 + 2 * 3.14 * height * getRadius();
    }
}

public class InheritancePracticeSet {

}
