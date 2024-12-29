package Recursion;

import java.util.Arrays;

public class Recursion16 {
    public static void main(String[] args) {
        int pawns = 25;
        int power = 1;
        int size = 50;

        int[] arr = new int[size];

        System.out.println(numberOfArrangements(arr, 0, pawns, power, 1));
        System.out.println(numberOfArrangementsOptimised(size, 0, pawns, power, 1));
    }

    static int numberOfArrangements(int[] arr, int index, int pawns, int power, int pawnIndex){
        
        if ((arr.length - index - 1) < (pawns - pawnIndex)*(power + 1)) return 0;

        if (pawnIndex > pawns){
            System.out.println("Success" + Arrays.toString(arr) + " | " + pawnIndex + " | " + index);
            return 1;
        }
        else{
            System.out.print("");
            //System.out.println(Arrays.toString(arr) + " | " + pawnIndex + " | " + index);
        }

        int ways = 0;

        for (int i = index; i < arr.length; i++){
            
            arr[i] = 1;
            ways += numberOfArrangements(arr, i + power + 1, pawns, power, pawnIndex + 1);
            arr[i] = 0;
        }

        return ways;
    }

    static int numberOfArrangementsOptimised(int length, int index, int pawns, int power, int pawnIndex){
        
        if ((length - index - 1) < (pawns - pawnIndex)*(power + 1)) return 0;

        if (pawnIndex > pawns){
            // System.out.println("Success" + Arrays.toString(arr) + " | " + pawnIndex + " | " + index);
            return 1;
        }
        // else{
        //     System.out.print("");
        //     //System.out.println(Arrays.toString(arr) + " | " + pawnIndex + " | " + index);
        // }

        int ways = 0;

        for (int i = index; i < length; i++){
            
            // arr[i] = 1;
            ways += numberOfArrangementsOptimised(length, i + power + 1, pawns, power, pawnIndex + 1);
            // arr[i] = 0;
        }

        return ways;
    }

}
