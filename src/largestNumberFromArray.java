import java.util.Arrays;

public class largestNumberFromArray {
    static boolean comparator(int a, int b){
        int tempA = a, tempB = b;
        int digitsA = 0, digitsB = 0;
        while (tempA > 0){
            tempA = tempA / 10;
            digitsA++;
        }
        while (tempB > 0){
            tempB = tempB / 10;
            digitsB++;
        }

        return (a*Math.pow(10,digitsB) + b) >= (b*Math.pow(10,digitsA) + a);

    }

    static String solution(int[] A){
        // Sorting this array with if (a:b) > (b:a), a should come before b ,
        // for 3 and 114, since 3114 > 1143, 3 comes first
        int temp;
        for (int i = 0; i < A.length; i++){
            for (int j = i + 1; j < A.length; j++){
                if (!comparator(A[i], A[j])){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(A));
        return "String";
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        solution(arr);
    }
}
