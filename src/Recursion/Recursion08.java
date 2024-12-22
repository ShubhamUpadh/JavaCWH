package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion08 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,1));
        mergeSort(arr);
    }
    static void mergeSort(ArrayList<Integer> arr){
        System.out.println("Before sorting = " + arr);
        //ArrayList<Integer> a = mergeSortHelper(arr);
        //System.out.println("After sorting = " + a);
        ArrayList<Integer> a = mergeSortHelper2(arr, 0 , arr.size()-1);
        System.out.println("After another sorting = " + a);
    }

    static ArrayList<Integer> mergeSortHelper(ArrayList<Integer> arr){
        int start = 0 , end = arr.size()-1;
        System.out.println(arr + " " + start + " " + end);
        if (arr.size() == 1) return arr;

        int mid = (end + start) / 2;
        ArrayList<Integer> leftSplit = new ArrayList<>();
        ArrayList<Integer> rightSplit = new ArrayList<>();

        for (int i = start; i <= end; i++){
            if ( i <= mid) leftSplit.add(arr.get(i));
            else rightSplit.add(arr.get(i));

        }

//        ArrayList<Integer> leftSplit = (ArrayList<Integer>) arr.subList(start, mid);
//        ArrayList<Integer> rightSplit = (ArrayList<Integer>) arr.subList(mid+1, end);

        ArrayList<Integer> leftArr = mergeSortHelper(leftSplit);
        ArrayList<Integer> rightArr = mergeSortHelper(rightSplit);

        return mergedArr(leftArr,rightArr);
    }

    static ArrayList<Integer> mergeSortHelper2(ArrayList<Integer> arr, int start, int end){
        //int start = 0 , end = arr.size()-1;
        List<Integer> a = arr.subList(start, end +1);
        System.out.print(arr + " " + start + " " + end + " | " + a);
        System.out.println();
        if (end == start) {
            ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(arr.get(start)));
            System.out.println("Single array being returned = " + ar);
            return ar;
        }

        int mid = (end + start) / 2;
//        ArrayList<Integer> leftSplit = new ArrayList<>();
//        ArrayList<Integer> rightSplit = new ArrayList<>();
//
//        for (int i = start; i <= end; i++){
//            if ( i <= mid) leftSplit.add(arr.get(i));
//            else rightSplit.add(arr.get(i));
//
//        }

//        ArrayList<Integer> leftSplit = (ArrayList<Integer>) arr.subList(start, mid);
//        ArrayList<Integer> rightSplit = (ArrayList<Integer>) arr.subList(mid+1, end);

        ArrayList<Integer> leftArr = mergeSortHelper2(arr, start, mid);
        ArrayList<Integer> rightArr = mergeSortHelper2(arr, mid + 1, end);

        System.out.println("leftArr = " + leftArr + " | " + " rightArr = " + rightArr);

        ArrayList<Integer> mArr =  mergedArr(leftArr,rightArr);
        System.out.println("Merged Array :: " + mArr);
        return mArr;
    }


    static ArrayList<Integer> mergedArr(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr){

        ArrayList<Integer> retArr = new ArrayList<>();

        int p1 = 0, p2 = 0;
        System.out.println(leftArr + " | " + rightArr);

        while (p1 < leftArr.size() && p2 < rightArr.size()){
            if (leftArr.get(p1) < rightArr.get(p2)){
                retArr.add(leftArr.get(p1));
                p1++;
            }
            else{
                retArr.add((rightArr.get(p2)));
                p2++;
            }
        }
        if (p1 == leftArr.size()){
            while (p2 < rightArr.size()){
                retArr.add(rightArr.get(p2));
                p2++;
            }
        }
        else{
            while (p1 < leftArr.size()){
                retArr.add(leftArr.get(p1));
                p1++;
            }
        }
        System.out.println("Returned Array @ mergeFunction" + retArr);
        return retArr;
    }
}
