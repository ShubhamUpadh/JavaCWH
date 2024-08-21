import java.util.Arrays;

public class sortSquaredArray {
    public static void main(String[] args) {
        int[] arr = {-6, -3, -1, 2, 4, 5};
        System.out.println(Arrays.toString(sol(arr)));
    }
    static int[] sol(int[] arr){
        int i = 0;

        for(; i < arr.length; i++){
            if (arr[i] >= 0) break;
        }

        if (i == 0){
            for (; i < arr.length; i++){
                arr[i] = arr[i] * arr[i];
                return arr;
            }
        }
        else{
            int[] newArr = new int[arr.length];
            int j = i - 1;

            for (int k = 0; k < arr.length; k++){
                if (i < arr.length && Math.abs(arr[i]) < Math.abs(arr[j])){
                    newArr[k] = arr[i] * arr[i];
                    i++;
                }
                else if (j > -1) {
                    newArr[k] = arr[j] * arr[j];
                    j--;
                }
            }
            return newArr;
        }
        return arr;

    }
}
