import java.util.Arrays;

public class RearrangeArray {
    public static int[] RearrangeArr(int[] arr, int n){
        int[] resArr = new int[n];
        int posP = 0, negP = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                if (arr[posP] < 0){
                    while (posP < n - 1){
                        posP++;
                        if (arr[posP] >= 0){
                            break;
                        }
                    }
                }
                resArr[i] = arr[posP];
                posP++;
            }
            else{
                if (arr[negP] >= 0){
                    while (negP < n ){
                        negP++;
                        if (arr[negP] < 0){
                            break;
                        }
                    }
                }

                resArr[i] = arr[negP];
                negP++;
            }

        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(RearrangeArr(arr, arr.length)));
    }
}
