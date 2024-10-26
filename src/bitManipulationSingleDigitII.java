import java.util.Arrays;

public class bitManipulationSingleDigitII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,5};
        System.out.println(Arrays.toString(singleDigit(arr)));

    }
    static int[] singleDigit(int[] arr){
        long XORR = arr[0];         // We are taking long here because if ar has -2^31, taking (XOR - 1) will overflow
        for (int i = 1; i < arr.length; i++) XORR ^= arr[i];
        long rightBit = (XORR & (XORR-1)) ^ XORR;
        int bucket1 = 0, bucket2 = 0;
        for (int j : arr) {
            if ((rightBit & j) == rightBit) bucket1 ^= j;
            else bucket2 ^= j;
        }
        return new int[]{bucket1, bucket2};
    }
}
