package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion11 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2};
        List<List<Integer>> res = new ArrayList<>();
        subSetHelper(arr,0, new boolean[arr.length] ,res, new ArrayList<>());
        System.out.println(res);
    }

    static void subSetHelper(int[] arr, int index, boolean[] isUsed, List<List<Integer>> res, ArrayList<Integer> ds){

        System.out.println("index = " + index + " | ds = " + ds);
        if(!res.contains(ds))res.add(new ArrayList<>(ds));
        
        for(int i = index; i < arr.length; i++){
            //if (isUsed[i] || (i > 0 && arr[i] == arr[i-1] && !isUsed[i])) continue;
            
            ds.add(arr[i]);
            isUsed[i] = true;
            subSetHelper(arr, i + 1, isUsed, res, ds);
            ds.remove(ds.size()-1);
            isUsed[i] = false;

        }


        
        // if (!ds.isEmpty()) ds.remove(ds.size()-1);
        // subSetHelper(arr, index + 1, res, ds);

        // ds.add(arr[index]);
        // subSetHelper(arr, index+1, res, ds);
        // ds.remove(ds.size()-1);
        
        // ds.add(arr[index]);
        // subSetHelper(arr, index+1, res, ds);
        // ds.remove(ds.size()-1);
        // subSetHelper(arr, index+1, res, ds);

    }
}
