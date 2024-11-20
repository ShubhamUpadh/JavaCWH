package twoPointersQues;

public class DiffK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int B = 0;
        System.out.println(sol(arr,B));
    }
    public static int sol(int[] A, int B){
        int p1 = 0, p2 = 1;

        if ((A[A.length-1] - A[0]) < B) return 0;

        while (p2 < A.length && p1 > -1){
            int diff = A[p2] - A[p1];
            System.out.println(p1 + " ; " + p2);
            if(diff == B && p1 != p2) return 1;
            else if (diff < B) p2++;
            else p1++;
            if (p1 == p2) p2++;
        }
        return 0;
    }
}
