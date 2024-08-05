import java.util.Arrays;

public class addTwoNos {
    public static void main(String[] args) {
        int[] A = {2, 8, 8};
        int[] B = {7, 9, 7, 2, 4, 4, 5, 8};
        System.out.println(Arrays.toString(sol(A, B)));
        }

    static int[] sol(int[] A, int[] B){
        int length = A.length > B.length ? A.length+1 : B.length+1;
        int[] sum = new int[length];
        int i = A.length - 1, j = B.length - 1, k = sum.length - 1;
        int carry = 0;
        while (k >= 0){
            int total = 0;
            if (i > -1){
                total = A[i];
                i--;
            }
            if (j > -1){
                total += B[j];
                j--;
            }
            total += carry;
            carry = total / 10;
            sum[k] = total % 10;
            k--;
        }
        System.out.println(Arrays.toString(sum));
        if (sum[0] != 0){
            return sum;
        }
        else{
            int[] newArr = new int[sum.length-1];
            for (int c = 0; c < newArr.length; c++){
                newArr[c] = sum[c+1];
            }
            return newArr;
        }
    }
}
