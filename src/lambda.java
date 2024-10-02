interface newInt{
    public void meth1();
    public void meth2();
}
interface DemoLambda{
    public int meth3();
}
public class lambda {
    public static void main(String[] args) {
        //Anonymous Class
        newInt obj = new newInt(){
            @Override
            public void meth1(){};
            @Override
            public void meth2(){};
        };

        DemoLambda obj2 = ()->{
            System.out.println("This is a lambda expr");
            return 10;
        };
        System.out.println(obj2.meth3());

    }
}
