import java.lang.reflect.Array;
import java.util.Arrays;

public class woodcutingMadeEasy {
    public static void main(String[] args) {
        int[] arr = {4, 42, 40, 26, 46};
        int k = 20;
        System.out.println(sol(arr,k));
    }
    static int sol(int[] arr, int k){
        Arrays.sort(arr);
        int cumuSum = 0;
        int cutHeight = 0;
        for (int i = arr.length - 1; i > 0; i--){
            cumuSum += arr[i];
            cutHeight = (cumuSum - k) / (arr.length - i);
            if (cutHeight >= arr[i-1]){
                return cutHeight;
            }
        }
        return -1;
    }
}
