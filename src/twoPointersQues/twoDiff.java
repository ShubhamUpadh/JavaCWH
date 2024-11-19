package twoPointersQues;

import java.util.HashMap;

public class twoDiff {
    public static void main(String[] args) {
        int[] A = new int[]{20, 500, 1000, 200};
        int B = 0;
        System.out.println(sol(A,B));
    }
    public static int sol(int[] A, int b){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length;i++){
            int a = A[i];
            hashMap.put(b+a,i);
            hashMap.put(a-b,i);
        }
        for (int i = 0; i < A.length; i++){
            int a = A[i];
            if (hashMap.containsKey(a) && (hashMap.get(a) != i)) return 1;
        }
        return 0;
    }
}
