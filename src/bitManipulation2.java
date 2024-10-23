import java.util.Arrays;

public class bitManipulation2 {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(swap(10, 15)));
        //System.out.println(isBitSet(8,3));
        //System.out.println(setIthBit(9, 2));
        //System.out.println(clearIthBit(13,2));
        //System.out.println(toggleIthBit(9,2));
        //System.out.println(removeLastIthBit(9));
        //System.out.println(isPowerOf2(13));
        System.out.println(noOfSetBits(16));
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

    static int setIthBit(int A, int i){
        return A | (1 << i);
    }

    static int clearIthBit(int A, int i){
        {
            return (A & ~(1<<i));
        }
    }

    static int toggleIthBit(int A, int i){
        return A ^ (1<<i);
//        int temp = A;
//        boolean isSet = (temp>>i) % 2 != 0;
//        System.out.println(isSet);
//
//        if (isSet) return A & ~(1<<i);
//        else return A | (1<<i);
//        //return A;

    }

    static int removeLastIthBit(int A){
        int temp = A;
        temp = ~((~temp) + 1);
        return A & temp;
    }

    static boolean isPowerOf2(int A){
        return (A & (A-1)) == 0;
    }

    static int noOfSetBits(int A){
        int counter = 0;
        while (A > 0){
            A = A & (A-1);
            counter++;
        }
        return counter;
//        while (A > 0){
//            if (A % 2 != 0) counter++;
//            A /= 2;
//        }
//        return counter;
    }
}
