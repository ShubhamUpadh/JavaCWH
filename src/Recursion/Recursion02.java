package Recursion;

import java.util.Scanner;

public class Recursion02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String name = sc.nextLine();
//        BackTracking1toN(3,3);
        BackTrackingNto1(1,3);


    }

    static void namePrint(int n, String name){
        if (n == 0) return;
        System.out.println(name);
        namePrint(--n,name);
    }

    static void BackTracking1toN(int i, int n){
        if (i < 1) return;
        BackTracking1toN(i-1, n);
        System.out.println(i);
    }

    static void BackTrackingNto1(int i, int N){
        if (i > N) return;
        BackTrackingNto1(i+1, N);
        System.out.println(i);
    }


}
