package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion13 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        //allPermutations(arr, 0, new ArrayList<>(), new boolean[arr.length]);
        // int temp = arr[1];
        // arr[1] = arr[2];
        // arr[2] = temp;
        // swap(arr, 0, 1);
        // System.out.println(Arrays.toString(arr));
        // swap(arr, 0, 1);
        // System.out.println(Arrays.toString(arr));

        allPermutationsWithoutExtraSpace(arr, 0);

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void allPermutationsWithoutExtraSpace(int[] arr, int index){
        //System.out.println(Arrays.toString(arr) + " | " + index + " | ");
        if (index == arr.length){
            System.out.print("Here ");
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++){
            swap(arr, index, i);
            allPermutationsWithoutExtraSpace(arr, index+1);
            swap(arr, index, i);
        }
        return;

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
