import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static int[] push(int[] arr, int element){
        int[] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = element;
        return newArr;
    }

    public static int[] pop(int[] arr){
        return Arrays.copyOf(arr,arr.length-1);
    }


    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
//        int[] stack = {};
//
//        for (int j : arr) {
//            if (stack.length == 0 || stack[stack.length - 1] == j) {
//                stack = push(stack, j);
//            } else {
//                stack = pop(stack);
//            }
//        }

        int count = 0;
        Integer candidate = null;

        for (int j : arr){
            if (count == 0){
                candidate = j;
                count++;
            }
            else{
                count += (j == candidate)? 1 : -1;
            }
        }

        System.out.printf("Majority Element is %d ",candidate);
    }
//        int[] arr = {1,2,3,4,5};
//        int[] newArr = new int[arr.length];
//        newArr[newArr.length-1] = 10;
//
//        //System.out.println(newArr);
//
//        int[] newArr2 = Arrays.copyOf(arr,arr.length-1);
//
//        for (int x : newArr2){
//            System.out.printf("%d,  ",x);
//        }
//    }
}
