public class kadaneJava {
    public static void main(String[] args) {
        int[] arr = {5,4,1,7,8};
        System.out.println(kadane(arr));
    }
    static int kadane(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
