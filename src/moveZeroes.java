import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void solution(int[] arr){
        int slow = 0, fast = 0;
        int temp;
        while (fast < arr.length){
            if (arr[fast] == 0){
                fast++;
            }
            else{
                while (fast < arr.length && arr[fast] == 0){
                    fast++;
                }
                arr[slow] = arr[fast];
                arr[fast] = 0;
                slow++;
                fast++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
