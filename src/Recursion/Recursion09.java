package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion09 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        //System.out.println(Partition(arr,0, arr.size()-1));
        QuickSort(arr,0,arr.size()-1);
    }

    static void QuickSort(ArrayList<Integer> arr, int low, int high){
        if (low < high){
            int partition = Partition(arr, low, high);
            QuickSort(arr,low, partition-1);
            QuickSort(arr,partition+1, high);
        }
        System.out.println(arr);
    }

    static int Partition(ArrayList<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j){

            while (arr.get(i) <= pivot && i <= high - 1) i++;
            while (arr.get(j) > pivot && j >= low + 1) j--;

            if (i < j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        arr.set(low, arr.get(j));
        arr.set(j, pivot);

        System.out.println(arr);
        return j;

    }

}
