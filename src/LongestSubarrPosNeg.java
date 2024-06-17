import java.util.*;

public class LongestSubarrPosNeg {
    public static int maxLen(int[] arr, int k){
        Map<Integer, Integer> preSum = new HashMap<>();
        int currSum = 0;
        int len = arr.length;
        int maxL = -1;

        for (int i =0; i < len; i++){
            currSum += arr[i];

            if (currSum == k){
                maxL = Math.max(maxL,i+1);
            }

            int rem = currSum - k;

            if (preSum.containsKey(rem)) {
               maxL = Math.max(maxL, i -preSum.get(rem));
            }

            if (!preSum.containsKey(currSum)){
                preSum.put(currSum,i);
            }
        }

        return maxL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ");
    }
}
