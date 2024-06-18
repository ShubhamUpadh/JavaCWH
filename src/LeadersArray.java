import java.util.ArrayList;
import java.util.Scanner;

public class LeadersArray {
    public static ArrayList<Integer> Leaders(int[] arr, int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];

        for (int i = n - 2; i > -1; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for (int i = 0; i < n; i++){
            if (rightMax[i] <= arr[i]){
                list.add(arr[i]);
            }
        }
        //list.add(arr[n-1]);
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Enter the element no %d : ",i+1);
            arr[i] = sc.nextInt();
        }
        System.out.println(Leaders(arr,n));
    }
}
