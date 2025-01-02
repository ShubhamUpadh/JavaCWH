package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

class couple{
    int[] arr;
    int inv;
    public couple(int[] arr, int inv){
        this.arr = arr;
        this.inv = inv;
    }
    @Override
    public String toString(){
        return Arrays.toString(arr) + " | " + inv;
    }
}

public class Recursion20 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,2,4,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(inversions(arr));
        // System.out.println(merge(arr, new int[]{-2}).inv);
    }

    static int inversions(int[] arr){
        return inversionHelper(arr, 0, arr.length-1).inv;
    }

    static couple inversionHelper(int[] arr, int low, int high){
        
        if (low == high) return new couple(arr, 0);
        
        int mid = (low+high)/2;

        couple leftCouple = inversionHelper(arr, low, mid);

        couple rightCouple = inversionHelper(arr, mid+1, high);

        couple mergedCouple = merge(leftCouple.arr,rightCouple.arr);

        couple ret = new couple(mergedCouple.arr, leftCouple.inv + rightCouple.inv + mergedCouple.inv);

        System.out.println(ret);

        return ret;

    }

    static couple merge(int[] arr1, int[] arr2){
        int inv = 0;
        ArrayList<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                mergedList.add(arr1[i]);
                i++;
            } 
            else if (arr1[i] > arr2[j]){
                mergedList.add(arr2[j]);
                inv += 1;
                i++;
                // j++;
            }
        }

        if (i == arr1.length){
            while (j < arr2.length) {
                mergedList.add(arr2[j]);
                j++;
            }
        }
        if (j == arr2.length){
            boolean flag = true;
            while (i < arr1.length){
                if (flag){
                    flag = false;
                    mergedList.add(arr1[i]);
                    i++;
                    continue;
                }
                inv += (arr1.length - i);
                mergedList.add(arr1[i]);
                i++;
            }
        }

        int[] newArr = new int[arr1.length + arr2.length];

        for (int k = 0; k < newArr.length; k++){
            newArr[k] = mergedList.get(k);
        }

        return new couple(newArr, inv);

    }

}
