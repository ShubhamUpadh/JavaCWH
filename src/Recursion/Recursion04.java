package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion04 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseArr(arr));

        System.out.println(reverseArrTwoPointers(arr,0, arr.size()-1));

        System.out.println(isPalindrome("abbab", 0));


    }

    static ArrayList<Integer> reverseArr(ArrayList<Integer> arr){
        if (arr.size() == 1) return arr;
        int temp = arr.getFirst();
        ArrayList<Integer> currArr = reverseArr(new ArrayList<>(arr.subList(1,arr.size())));
        currArr.add(temp);
        return currArr;

    }

    static ArrayList<Integer> reverseArrTwoPointers(ArrayList<Integer> arr, int p1, int p2){
        if (p2 <= p1) return arr;

        int arrP1 = arr.get(p1);
        arr.set(p1, arr.get(p2));
        arr.set(p2, arrP1);

        return reverseArrTwoPointers(arr, p1 + 1, p2 - 1);

    }

    static boolean isPalindrome(String st, int i){
        if (i >= (int) st.length()/2) return true;
        return (st.charAt(i) == st.charAt(st.length()-i-1)) && isPalindrome(st, i + 1);
    }

}
