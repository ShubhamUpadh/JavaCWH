package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int i;
    int j;
    public Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
    @Override
    public String toString(){
        return "the pair value is " + this.i + " " + this.j;
    }
}

public class Graph08NumberofIslands {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
        System.out.println(numberOfIslands(matrix));
    }

    static int numberOfIslands(int[][] matrix){

        int i = 0, j = 0;
        int count = 0;
        Queue<Pair> q = new LinkedList<>();

        int[] dRow = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] dCol = new int[]{-1,0,1,-1,1,-1,0,1};

        System.out.println(matrix.length + " | " + matrix[0].length);

        while (i < matrix.length){
            j = 0;
            while (j < matrix[0].length){
                // System.out.println(" i = " + i + " j = " + j);
                if (matrix[i][j] == 1){
                    System.out.println("Here = " + i +" " + j);
                    matrix[i][j] = 2;
                    count++;
                    markIsland(matrix, i, j);
                }
                j++;
            }
            i++;
        }
        
        // System.out.println("Finished");
        
        for (int d = 0; d< matrix.length; d++){
            for (int e = 0; e < matrix[0].length; e++){
                System.out.print(" | " + matrix[d][e] + " | ");
            }
            System.out.println();
        }
        
        
    
    return count;
    }

    static void markIsland(int[][] matrix, int e, int f){
        matrix[e][f] = 2;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(e,f));
        int[] dRow = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] dCol = new int[]{-1,0,1,-1,1,-1,0,1};
        while (!q.isEmpty()){
            Pair currPair = q.poll();
            for (int k = 0; k < dRow.length; k++){
                int nextI = currPair.i + dRow[k];
                int nextJ = currPair.j + dCol[k];
                boolean isValid = nextI > -1 && nextI < matrix.length && nextJ > -1 && nextJ < matrix[0].length;
                if(isValid && matrix[nextI][nextJ] == 1){
                    q.add(new Pair(nextI, nextJ));
                    matrix[nextI][nextJ] = 2;
                }
            }
        }

        // System.out.println("Returning again @ " + e + " " + f);
        
        // for (int d = 0; d< matrix.length; d++){
        //     for (e = 0; e < matrix[0].length; e++){
        //         System.out.print(" | " + matrix[d][e] + " | ");
        //     }
        //     System.out.println();
        // }
    }
}

// q.add(new Pair(i, j));
// while (!q.isEmpty()){
//     Pair currPair = q.poll();
//     System.out.println(" \n Now here" + currPair);
//     for (int k = 0; k < 8; k++){
//         // System.out.println("Now here123");
//         int nextI = currPair.i + dRow[k];
//         int nextJ = currPair.j + dCol[k];
//         boolean isValid = nextI > 0 && nextI < matrix.length && nextJ > 0 && nextJ < matrix[0].length;
//         if (isValid && matrix[nextI][nextJ] == 1){
//             matrix[nextI][nextJ] = 2;
//             q.add(new Pair(nextI, nextJ));
//             // System.out.println("Added new pair = " + new Pair(nextI, nextJ).toString());
//         }
//     }
// }