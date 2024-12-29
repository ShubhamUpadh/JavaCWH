package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion17 {
    public static void main(String[] args) {
        List<List<String>> res = new ArrayList<>();
        palindromePartitioning("abab", 0, new ArrayList<>(), res);
        System.out.println(res);
        // System.out.println(splitString("abc", 0, 0));
        // ArrayList<String> ls = new ArrayList<>();
        // allSubstrings("abc", 0, ls);
        // System.out.println(ls);
        
    }

    static String[] splitString(String S, int index, int partition){
        String pre = "";
        String post = "";

        for (int i = 0; i < S.length(); i++){
            if (i >= partition) post += S.charAt(i);
            else if ( i >= index) pre += S.charAt(i);
        }

        System.out.println(pre + " | " +post);

        return new String[]{pre, post};

    }

    static void palindromePartitioning(String S, int index, List<String> path, List<List<String>> res){
        if (index == S.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < S.length(); i++){
            if (isPalindrome(S, index, i)){
                path.add(S.substring(index, i+1));
                palindromePartitioning(S, i + 1, path, res);
                path.remove(path.size()-1);
            }
        }

    }

    static boolean isPalindrome(String S, int start, int end){
        while (start <= end){
            if (S.charAt(start++) != S.charAt(end--)) return false;
        }
        return true;
    }


    static void allSubstrings(String S, int index, ArrayList<String> ds){
        if (!ds.contains(S)) ds.add(S);
        System.out.println(S);

        for (int i = index; i < S.length(); i++){
            String[] arr = splitString(S, index, i);
            System.out.println("Returned value = " + arr[0] + " | " +arr[1]);

            if (arr[0] != "") allSubstrings(arr[0], i + 1, ds);
            if (arr[1] != "") allSubstrings(arr[1], i + 1, ds);

        }
    }

}
