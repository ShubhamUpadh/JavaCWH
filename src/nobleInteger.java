import java.util.Arrays;

public class nobleInteger {
    public static void main(String[] args) {
        int[] arr = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5 };
        //System.out.println(Arrays.toString(arr));
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        Arrays.sort(arr);

        int[] newArr = new int[arr.length+1];
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {
            if (i == 0 && j == 0) {
                newArr[j] = arr[i];
                i++;
            } else if (arr[i] == newArr[j]) {
                j++;
            } else {
                newArr[j] = arr[i];
                j++;
                i++;
            }
        }
        for (i = 0; i < j; i++){
            if (newArr[i] == newArr.length - i - 1){
                return 1;
            }
        }
        return -1;
    }
}
