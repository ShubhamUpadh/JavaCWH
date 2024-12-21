package Recursion;

public class Recursion01 {
    static int n = 0;
    public static void main(String[] args) {
        recF();
    }

    static void recF(){
        if (n == 10) return;
        System.out.println(n++);
        recF();
    }
}
