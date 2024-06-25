class EkClass{
    int a;

    public int getA() {
        return a;
    }
    public EkClass(int a) {
        this.a = a;
    }


}

class DoClass extends EkClass{
    DoClass(int x){
        super(x);
    }
}


public class this_super {
}
