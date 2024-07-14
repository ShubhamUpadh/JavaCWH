import java.util.Arrays;

public class maxUnsortedSubarray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4,3, 2, 5 })));
    }
    static int[] solution(int[] arr){
        int id1 = -1, id2 = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i+1]){
                id1 = i;
                break;
            }
        }
        if (id1 == -1) return new int[]{-1};

        for (int i = arr.length - 1; i > 0; i--){
            if (arr[i] < arr[i-1]){
                id2 = i;
                break;
            }
        }
        return new int[]{id1, id2};
    }

}
