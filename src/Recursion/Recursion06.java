package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion06 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
        PrintAllSubsequences(arr);
    }
    static void PrintAllSubsequences(ArrayList<Integer> arr){
        printHelper(arr, new ArrayList<>(),0);
    }

    static void printHelper(ArrayList<Integer> arr, ArrayList<Integer> emptyArr, int i){
        if (i >= arr.size()){
            System.out.print(emptyArr+"\t");
            return;
        }
        emptyArr.add(arr.get(i));
        printHelper(arr, emptyArr, i + 1);
        emptyArr.removeLast();
        printHelper(arr,emptyArr,i+1);
        return;
    }

}
