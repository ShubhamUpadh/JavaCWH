package DPviaQuestions;

import java.util.Arrays;

public class DP04JumpGame {
    public static void main(String[] args) {
        
    }


}

class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;

        int[] ways = new int[nums.length];
        if (nums[0] == 0) return false;
        ways[0] = 1;

        for (int i = 0; i < nums.length; i++){
            if (ways[i] == 0){
                continue;
            }
            for (int j = i+1; j <= Math.min(i + nums[i], nums.length-1); j++){
                ways[j]++;
            }
            
            if (ways[nums.length-1] != 0){
                
                System.out.println("Here" + Arrays.toString(ways) + " | " + ways[nums.length-1]);
                return true;
            }
        }
        System.out.println(Arrays.toString(nums));
        return false;


    }
}
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int maxDist = -1;
        for (int i = 0; i < nums.length; i++){
            if (i > maxDist && i != 0) return false;
            maxDist = Math.max(maxDist, i + nums[i]);
            if (maxDist >= nums.length - 1 ) return true;
        }
        return false;
    }
}