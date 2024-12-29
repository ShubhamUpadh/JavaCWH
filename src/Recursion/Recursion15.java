package Recursion;

import java.lang.Math;
import java.util.Arrays;

public class Recursion15 {
    public static void main(String[] args) {
        
    int n = 6;
    int[] arr = new int[n];
    // int power = 5;
    // int pawns = 3;
    //System.out.println(waysOfKeeping(arr, 0, power, pawns, 1));

    //System.out.println(isSafe(new int[]{1},new int[]{0}, 3, 1, 1));
    solve(n);
    }

    static void solve(int n){
        int[][] board = new int[n][n];
        System.out.println(nQueens(board, new int[n], new int[n], 0, n, false));
    }

    static int waysOfKeeping(int[] arr, int index, int power, int pawns, int pawnIndex){
        if (pawnIndex == 0) return true;
        if (pawnIndex > pawns) return 1;
        int ways = 0;

        for (int i = index; i < arr.length; i++){

        }

        return ways;
    }

    static int nQueens(int[][] board, int[] rowArr, int[] columnArr, int index, int n, boolean prevContains){
        //System.out.println(" normal print " );
        // print2DArr(board);
        if (index == n && prevContains){
            System.out.println("\n Solution found ");
            print2DArr(board);
            System.out.println();
            return 1;
        }
        
        int retVal = 0;
        // boolean val = false;
        for (int i = 0; i < n; i++){
            if (isSafe(rowArr, columnArr, i, index)){    
                rowArr[index] = i;
                columnArr[index] = index;           
                board[i][index] = 1;
                System.out.println("Calling from here");
                print2DArr(board);
                retVal += nQueens(board, rowArr, columnArr, index + 1, n,true);
                rowArr[index] = 0;
                columnArr[index] = 0;
                board[i][index] = 0;
            }
        }
        return retVal;
    }

    static boolean isSafe(int[] rowArr, int[] columnArr, int row, int col){
        if (col == 0) return true;
        for (int i = 0 ; i < col; i++){
            if (rowArr[i] == row || (Math.abs(rowArr[i]-row) == Math.abs(columnArr[i]-col))){ 
                //System.out.println("Truth value");
                return false;}
        }
        return true;
    }

    static void print2DArr(int[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
