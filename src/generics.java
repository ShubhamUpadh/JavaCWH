import java.util.ArrayList;

class MyGeneric<GenericType>{
    int a;
    GenericType val;
    public MyGeneric(int a, GenericType g1){
        this.a = a;
        this.val = g1;
    }
    public void values(){
        System.out.println(this.a + " " + this.val);
    }
}

public class generics {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        int a = (int) al.getFirst();

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(12);
        int a1 = al2.getFirst();


        MyGeneric<String> myGen1 = new MyGeneric<>(23,"StringVal");
        myGen1.values();
    }
}
