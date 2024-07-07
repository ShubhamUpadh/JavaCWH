interface Int1{
    void meth1();
    void meth2();
}

interface Int2 extends Int1{
    void meth3();
    void meth4();
}

class childSampleInterface implements Int2{
    @Override
    public void meth3(){};
    @Override
    public void meth4(){};
    @Override
    public void meth1(){};
    @Override
    public void meth2(){};

}

public class inheritanceInInterfaces {
}
