import java.util.Arrays;

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void solution(int[] arr){
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length - 1; i = i + 2){
            temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        return;
    }
}
