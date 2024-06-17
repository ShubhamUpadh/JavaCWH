import java.util.Arrays;

public class KadaneAlgo {
    public static int[] Kadane(int[] arr){
        int currSum = 0;
        int fast = 0, slow = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] maxArr = new int[2];

        while (fast < arr.length){
            currSum += arr[fast];
            if (maxSum < currSum){
                maxSum = currSum;
                maxArr[0] = slow;
                maxArr[1] = fast;
            }
            //maxSum = Math.max(maxSum, currSum);

            if (currSum < 0){
                while (slow <= fast){
                    currSum -= arr[slow];
                    slow++;
                    if (currSum >= 0){
                        break;
                    }
                }
            }
            fast++;
        }
        return maxArr;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(Arrays.toString(Kadane(nums)));
        //System.out.printf(Kadane(nums));
    }
}
