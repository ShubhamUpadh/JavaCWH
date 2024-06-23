import java.util.Arrays;
import java.util.Scanner;
class Solution {
    static void reverseArr(int[] arr, int low, int high){
        int temp;
        for (int i = low; i <= low + (high-low)/2; i++){
            temp = arr[i];
            arr[i] = arr[high - (i - low)];
            arr[high - i + low] = temp;
        }
    }

    public void nextPermutation(int[] arr) {
        int pivot = -2;
        for (int i = arr.length - 1; i > 0; i--){
            if (arr[i-1] < arr[i]){
                pivot = i-1;
                break;
            }
        }
        if (pivot == -2){
            //reverse the array;
            reverseArr(arr,0, arr.length-1);
            return;
        }

        for (int i = arr.length-1; i > pivot; i--){
            if (arr[pivot] < arr[i]){
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        reverseArr(arr, pivot + 1, arr.length - 1);


        //return new int[]{1,2};

    }
}
public class NextPermutation {
    static void reverseArr(int[] arr, int low, int high){
        System.out.println(Arrays.toString(arr) + " " + low + " " + high);
        int temp;
        for (int i = low; i <= low + (high-low)/2; i++){
            temp = arr[i];
            arr[i] = arr[high - (i - low)];
            arr[high - (i - low)] = temp;
        }
        System.out.println(Arrays.toString(arr) + " After reversal");
    }
    static void nextPerm(int[] arr){
        int pivot = -2;
        for (int i = arr.length - 1; i > 0; i--){
            if (arr[i-1] < arr[i]){
                pivot = i-1;
                break;
            }
        }
        if (pivot == -2){
            //reverse the array;
            reverseArr(arr,0, arr.length-1);
            return;
        }
        System.out.println(Arrays.toString(arr)+ " pivot = " + pivot);


        reverseArr(arr, pivot + 1, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[pivot];
        arr[pivot] = temp;
        System.out.println(Arrays.toString(arr));

        //return new int[]{1,2};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("number of elements : ");
        //int n = sc.nextInt();

        int[] arr = {2, 3, 1};

        //for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        nextPerm(arr);
        System.out.println(Arrays.toString(arr));

    }

}
