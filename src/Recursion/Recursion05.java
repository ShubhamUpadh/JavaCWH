package Recursion;

import java.time.Instant;

public class Recursion05 {
    static int[] memo = new int[10000];

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n = 30;
        System.out.println(FibboPlain(n));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(FibboMemo(n));
        long memoEndTime = System.currentTimeMillis();
        System.out.println(memoEndTime - endTime);


    }

    static int FibboPlain(int n){
        if (n <= 1){
            return n;
        }
        System.out.println(n);
        return FibboPlain(n - 1) + FibboPlain(n - 2);
    }

    static int FibboMemo(int n){
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        return FibboMemo(n-1) + FibboMemo(n-2);
    }
}
