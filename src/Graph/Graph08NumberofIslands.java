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
        int[][] matrix = new int[][]{{0,0},{0,0}};
        System.out.println(numberOfIslands(matrix));
    }

    static int numberOfIslands(int[][] matrix){
        
        int i = 0, j = 0;
        int count = 0;
        Queue<Pair> q = new LinkedList<>();

        int[] dRow = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] dCol = new int[]{-1,0,1,-1,1,-1,0,1};

        while (i < matrix.length){
            while (j < matrix[0].length){
                if (matrix[i][j] == 1){
                    System.out.print("Here");
                    matrix[i][j] = 2;
                    count++;
                    q.add(new Pair(i, j));
                    while (!q.isEmpty()){
                        Pair currPair = q.poll();
                        System.out.println(" \n Now here" + currPair);
                        for (int k = 0; k < 8; k++){
                            System.out.println("Now here123");
                            int nextI = currPair.i + dRow[k];
                            int nextJ = currPair.j + dCol[k];
                            boolean isValid = nextI > 0 && nextI < matrix.length && nextJ > 0 && nextJ < matrix[0].length;
                            if (isValid && matrix[nextI][nextJ] == 1){
                                matrix[nextI][nextJ] = 2;
                                q.add(new Pair(nextI, nextJ));
                                // System.out.println("Added new pair = " + new Pair(nextI, nextJ).toString());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Finished");
        return count;
    }
}
