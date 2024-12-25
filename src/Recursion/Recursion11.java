package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion11 {
    public static ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        subsetHelper(arr, 0, 0, ans);
        return ans;
    }

    static void subsetHelper(int[] arr, int index, int runningSum,
                      ArrayList<Integer> ans){
        if (index == arr.length){
            ans.add(new ArrayList(Arrays.asList(runningSum)));
            return;
        }

        for (int i = index; i < arr.length; i++){
            //ds.add(arr[i]);
            // runningSum += arr[i];
            subsetHelper(arr, index + 1, runningSum + arr[i], ans);
            //ds.removeLast();
        }


    }
}
