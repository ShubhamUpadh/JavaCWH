package twoPointersQues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class threeSum {
    public static void main(String[] args) {
        int[] A = new int[]{-1, 2, 1, -4};
        int B =  1;
        System.out.println(Arrays.toString(sol(A, B)));

    }
    public static int[] sol(int[] A, int B){
        if (A.length < 3){
            return new int[]{-1};
        }
        Arrays.sort(A);
        boolean found = false;
        long closestSum = A[0] + A[1] + A[2];

        for (int i = 0; i < A.length; i++){
            //int currSum = A[i];
            int p1 = 0, p2 = A.length - 1;

            while (p1 < p2){
                if (p1 == i) p1++;
                if (p2 == i) p2 --;

                long currSum = A[i] + A[p1] + A[p2];

                closestSum = (Math.abs(closestSum - B) > Math.abs(currSum - B)) ? currSum : closestSum;

                if (currSum == B){
                    found = true;
                    break;
                }
                else if (currSum > B) p2--;
                else p1++;
            }
            if (found) break;
        }
        return new int[]{(int) closestSum};
    }
}
