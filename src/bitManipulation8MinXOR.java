import java.util.Arrays;

public class bitManipulation8MinXOR {
    public static void main(String[] args) {
        int[] arr = {0, 5, 1, 7};
        System.out.println(sol(arr));
    }
    static int sol(int[] arr){
        Arrays.sort(arr);
        int minV = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++){
            minV = Math.min(minV, arr[i] ^ arr[i+1]);
        }
        return minV;
    }
}
