class C1{
    public int x= 10;
    private int y = 11;
    protected int z = 12;
    int a = 13;
}

class C2 extends C1{
    public void printer(){
        System.out.println("x " + this.x + " ,z " +  this.z + " ,a" + this.a);
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        C2 c2 = new C2();
        System.out.println("x " + c2.x + " ,z " +  c2.z + " ,a" + c2.a);
    }
}
