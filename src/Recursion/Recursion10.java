package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Recursion10 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,6,7));
        int sum = 7;

        combinationSum(arr, sum);
    }

    static void combinationSum(ArrayList<Integer> artr, int sum){
        //combinationSumHelper(arr, sum, 0, 0, new ArrayList<Integer>(), new HashSet<>());
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] arr = new int[]{2,3,6,7};
        combinationSumHelper2(arr,sum,0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void combinationSumHelper(ArrayList<Integer> arr, int sum, int index, int runningSum,
                                     ArrayList<Integer> emptyArr, Set<ArrayList<Integer>> ansSet){
        if (index >= arr.size()) return;
        if (runningSum == sum && !ansSet.contains(emptyArr)){
            System.out.println(emptyArr);
            ansSet.add(emptyArr);
            return;
        }

        if (runningSum > sum) return;

        emptyArr.add(arr.get(index));
        combinationSumHelper(arr, sum, index, runningSum + arr.get(index), emptyArr, ansSet);

        combinationSumHelper(arr, sum, index+1, runningSum + arr.get(index), emptyArr, ansSet);

        emptyArr.removeLast();
        combinationSumHelper(arr, sum,index+1,runningSum,emptyArr, ansSet);

        return;
    }

    static void combinationSumHelper2(int[] arr, int sum, int index, ArrayList<Integer> currElements,
                                      ArrayList<ArrayList<Integer>> ans){
        if (index == arr.length){
            if (sum == 0){
                System.out.println(currElements);
                ans.add(new ArrayList<>(currElements));
            }
            return;
        }

        if (arr[index] <= sum){
            currElements.add(arr[index]);
            combinationSumHelper2(arr,sum - arr[index], index,currElements,ans);
            currElements.removeLast();
        }
        combinationSumHelper2(arr, sum, index+1,currElements,ans);

    }
}
