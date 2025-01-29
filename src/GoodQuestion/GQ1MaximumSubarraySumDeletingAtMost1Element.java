package GoodQuestion;

import org.junit.jupiter.api.test;
import static org.junit.jupiter.api.Assertions.*;

public class GQ1MaximumSubarraySumDeletingAtMost1Element {
    public static void main(String[] args) {
        MaxSumTest msTest = new MaxSumTest();
        msTest.TestEmptyArray();
        msTest.TestNormalArray();
    }
}

class Sol{
    public int maxSum(int[] arr){
        int ans = 0;
        int n = arr.length;
        if (n == 1) return arr[0];
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        // leftSum[0] = 0;
        // rightSum[n - 1] = 0;

        for (int i = 1; i < n; i++){
            leftSum[i] = Math.max(leftSum[i-1] + arr[i-1], 0);
        }

        for (int i = n-2; i > -1; i--){
            rightSum[i] = Math.max(rightSum[i+1] + arr[i + 1], 0);
        }

        // int[] lrSum = new int[n];
        // for (int i = 0; i < n; i++){
        //     lrSum = 
        // }
        
        int currSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int tempSum = arr[i] + leftSum[i] + rightSum[i];
            currSum = Math.max(currSum, tempSum);
        }

        return currSum;
    }
}

class MaxSumTest{
    @Test
    void TestNormalArray(){
        Sol ms = new Sol();
        int[] arr = new int[]{1, -2, 3, -4, 5};
        int maxSum = ms.maxSum(arr);
        assertEquals( 5, maxSum,"Normal Case Failed");

    }
    
    @Test
    void TestEmptyArray(){
        Sol ms = new Sol();
        int[] arr = {};
        int maxSum = ms.maxSum(arr);
        assertEquals(-1, maxSum,"Failed for empty class");
    }

}
