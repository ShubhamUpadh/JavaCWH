package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion22 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        System.out.println(sol(nums));
    }

    static List<List<Integer>> sol(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] isUsed = new boolean[nums.length];

        helper(res, nums, isUsed, new ArrayList<>());
        return res;
    }

    static void helper(List<List<Integer>> res, int[] nums, boolean[] isUsed, ArrayList<Integer> curr){
        if (curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (!isUsed[i]){
                curr.add(nums[i]);
                isUsed[i] = true;
                helper(res, nums, isUsed, curr);

                curr.remove(curr.size()-1);
                isUsed[i] = false;
            }
        }


    }
}
