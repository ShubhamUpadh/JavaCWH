import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class maxDIstance {
    static int solution(int[] arr){
        HashMap<Integer, Integer> indexStore = new HashMap<>();
        int[] maxIndexRight = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            indexStore.put(arr[i], i);
        }

        Arrays.sort(arr);
        int currMax = -1 * (arr.length + 1);
        maxIndexRight[arr.length-1] = currMax;

        for (int i = arr.length-2; i > -1; i--){
            maxIndexRight[i] = Math.max(maxIndexRight[i+1], indexStore.get(arr[i]));
        }
        System.out.println(Arrays.toString(maxIndexRight));

        for (int i = 0; i < arr.length; i++){
            currMax = Math.max(maxIndexRight[i] - indexStore.get(arr[i]),currMax);
        }
        return currMax;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,4};
        System.out.println(solution(arr));
    }
}
