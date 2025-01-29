package DPviaQuestions;

public class DP03HouseRobber1 {
    
    public int rob(int[] nums) {
        if (nums.length <= 2){
            if (nums.length == 1) return nums[0];
            else return Math.max(nums[0], nums[1]);
        }
        int max = Integer.MIN_VALUE;
        // int[] dp = new int[nums.length];
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[1], dp[0]);

        int prev1 = nums[0], prev2 = Math.max(prev1,nums[1]);

        for (int i = 2; i < nums.length; i++){
            int curr = Math.max(prev2, prev1 + nums[i]);
            prev1 = prev2;
            prev2 = curr; 
            max = Math.max(prev2, max);
        }

        return max;
    }
}
