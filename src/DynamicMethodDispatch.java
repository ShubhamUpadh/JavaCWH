class Phone{
    public void name(){
        System.out.println("Normal Phone");
    }
    public void greet(){
        System.out.println("Hello");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Hello");
    }

    public void name(){
        System.out.println("Smartphone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//
        Phone obj = new SmartPhone();
//        SmartPhone obj1 = new Phone();
        obj.greet();
        obj.name();
//        obj.name();
    }
}
