import java.util.Arrays;

public class bitManipulation2 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(swap(10, 15)));
        System.out.println(isBitSet(8,3));
    }
    static int[] swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a,b};
    }

    static boolean isBitSet(int A, int i){
        //A = A >> i;
        return (A>>i) % 2 != 0;
    }
}
