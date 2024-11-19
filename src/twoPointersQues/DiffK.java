package twoPointersQues;

public class DiffK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,5,6,7,8,9,100};
        int B = 0;
        System.out.println(sol(arr,B));
    }
    public static int sol(int[] A, int B){
        int p1 = 0, p2 = 1;

        if ((A[A.length-1] - A[0]) < B) return 0;

        while (p2 < A.length && p1 > -1){
            int diff = A[p2] - A[p1];
            if(diff == B) return 1;
            else if (diff < B) p2++;
            else p1++;
        }
        return 0;
    }
}
