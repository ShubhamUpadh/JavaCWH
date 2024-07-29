public class perfectPeak {
    static int solution(int[] arr){
        int[] rightSmaller = new int[arr.length];
        int [] leftGreater = new int[arr.length];
        rightSmaller[arr.length-1] = arr.length-1;
        leftGreater[0] = 0;

        for (int i = 1; i< arr.length; i++){
            if (arr[i] > arr[leftGreater[i-1]]) leftGreater[i] = i;
            else leftGreater[i] = leftGreater[i-1];
        }

        for (int i = arr.length - 2; i > 0; i--){
            if (arr[i] < arr[rightSmaller[i+1]]) rightSmaller[i] = i;
            else rightSmaller[i] = rightSmaller[i+1];
            if (rightSmaller[i] == leftGreater[i]) return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 6, 8, 9, 10, 7};
        System.out.println(solution(arr));
    }
}
