package Recursion;

import java.util.ArrayList;

public class Recursion19 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        // allPermutations(arr, new boolean[arr.length], new ArrayList<>());
        int n = 4;
        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 1; i <= n; i++) choices.add(i);
        int target = 12;
        System.out.println(kthPermutation(choices, target, new ArrayList<>(), n));
    }

    static void allPermutations(int[] arr, boolean[] isUsed, ArrayList<Integer> curr){
        if (curr.size() == arr.length) {
            System.out.println(curr);
            return;
        }

        for (int i = 0; i < arr.length; i++){
            if(isUsed[i] || (i > 0 && arr[i] == arr[i-1] && isUsed[i-1] == true)) continue;

            isUsed[i] = true;
            curr.add(arr[i]);
            allPermutations(arr, isUsed, curr);
            isUsed[i] = false;
            curr.remove(curr.size()-1);
        }

    }   

    static int factorial(int a){
        if (a == 1) return a;
        return a * factorial(a-1);
    }

    static ArrayList<Integer> kthPermutation(ArrayList<Integer> choices, int target, 
    ArrayList<Integer> ans, int n){
        if (ans.size() == n){
            return ans;
        }
        if(target <= 1){
            ans.addAll(choices);
            return ans;
        }
        int contri = factorial(choices.size()-1);
        int location = (int)(target-1)/contri;
        ans.add(choices.get(location));
        choices.remove(location);
        target = target - (int)(target/contri)*contri;

        return kthPermutation(choices, target, ans, n);

    }


}
