package Recursion;

import java.util.ArrayList;

public class Recursion13 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        allPermutations(arr, 0, new ArrayList<>(), new boolean[arr.length]);

    }
    static void allPermutations(int[] arr, int index, ArrayList<Integer> ds, boolean[] isUsed){
        if (ds.size() == arr.length){
            System.out.println(ds);
            return;
        }
        for (int i = 0; i < arr.length;i++){
            if (isUsed[i]) continue;
            ds.add(arr[i]);
            isUsed[i] = true;
            allPermutations(arr, index+1, ds, isUsed);
            ds.remove(ds.size()-1);
            isUsed[i] = false;
        }
    } 
}
