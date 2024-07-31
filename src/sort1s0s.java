import java.lang.reflect.Array;
import java.util.Arrays;

public class sort1s0s {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1};
        sol(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sol(int[] arr){
        int start = 0, end = arr.length - 1;
        while (start < end){
            if (arr[start] == 1){
                // find the element from last which is 0
                while (arr[end] == 1 && start<end) end--;
                arr[end] = 1;
                arr[start] = 0;
            }
            start++;
        }
    }
}
