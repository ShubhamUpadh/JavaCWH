import java.util.Scanner;

public class LongestSubarrPositive {
    public static int maxV(int a, int b){
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i =0; i< arr.length; i++){
            System.out.println("Enter element number " + (i + 1));
            arr[i] = sc.nextInt();
        }
        int slow = 0,fast = 0;
        System.out.println("Enter target sum");
        int targetSum = sc.nextInt();
        int currSum = 0, maxId = -1;

        while (fast < arr.length){
            currSum += arr[fast];
            if (currSum==targetSum){
                maxId = maxV(maxId,fast-slow);
                System.out.printf("Fast = %d   and    Slow = %d \n",fast,slow);
            }
            else if (currSum > targetSum) {
                while (slow <= fast){
                    currSum -= arr[slow];
                    slow++;
                    if (currSum < targetSum){
                        break;
                    }
                }
            }
            fast++;
        }

        System.out.println(maxId+1);


    }
}
