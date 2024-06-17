import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (hMap.containsKey(target-arr[i])){
                return new int[]{i,hMap.get(target-arr[i])};
            }
            else{
                hMap.put(arr[i],i);
            }
        }
        return  new int[]{-1,-1};
    }
    public static void main(String[] args) {

    }
}
