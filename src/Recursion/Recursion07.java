package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion07 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,2));
        //SubSequenceSumtoK(arr,4);
        //printOnlyOnce(arr,10);
        countSubsequencesSumToK(arr,-1);
    }

    static void SubSequenceSumtoK(ArrayList<Integer> arr, int k){
        subSeqHelper(arr,k,0, 0, new ArrayList<Integer>(), new ArrayList<Integer>());
    }

    static void subSeqHelper(ArrayList<Integer> arr, int k, int i, int carrySum, ArrayList<Integer> emptyArr, ArrayList<Integer> indexes){
        if (k == carrySum){
            System.out.println("Subset = " + emptyArr);
            System.out.println("Indexes = " + indexes);
        }

        if (i == arr.size()){
            return;
        }

        emptyArr.add(arr.get(i));
        indexes.add(i);
        subSeqHelper(arr,k,i+1,carrySum+arr.get(i),emptyArr,indexes);

        emptyArr.remove(emptyArr.size()-1);
        indexes.remove(indexes.size()-1);
        subSeqHelper(arr,k,i+1,carrySum,emptyArr,indexes);

    }

    static void printOnlyOnce(ArrayList<Integer> arr, int target){
        boolean flag = printHelper(arr,target,0, 0, new ArrayList<Integer>());
        if (!flag) System.out.println("No such subsequence exists");
    }

    static boolean printHelper(ArrayList<Integer> arr, int target, int index, int runningSum, ArrayList<Integer> emptyArr){
        if (runningSum == target){
            System.out.println(emptyArr);
            return true;
        }
        if (index >= arr.size()) return false;

        emptyArr.add(arr.get(index));
        boolean flag =  printHelper(arr, target, index+1, runningSum + arr.get(index), emptyArr);
        if (flag) return true;

        emptyArr.removeLast();
        flag = printHelper(arr,target,index+1,runningSum, emptyArr);
        if (flag) return true;

        return false;
    }

    static void countSubsequencesSumToK(ArrayList<Integer> arr, int target){
        System.out.println("Number of sunseq that sum to " + target + " is ::  " +
                countHelper(arr, target, 0, 0, new ArrayList<Integer>()));
    }

    static int countHelper(ArrayList<Integer> arr, int target, int index, int runningSum, ArrayList<Integer> emptyArrayy){
        if (target == runningSum) return 1;
        if (index >= arr.size()) return 0;

        emptyArrayy.add(arr.get(index));
        int includeVal = countHelper(arr,target,index+1,runningSum+arr.get(index),emptyArrayy);

        emptyArrayy.removeLast();
        int removedVal = countHelper(arr, target, index+1, runningSum, emptyArrayy);

        return (removedVal + includeVal);
    }
}
