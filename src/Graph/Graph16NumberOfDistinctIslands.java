package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int i;
    int j;
    public Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}

public class Graph16NumberOfDistinctIslands {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,1,0,1,1},{1,0,0,0,0},{0,0,0,0,1},{1,1,0,1,1}};
        System.out.println(sol(matrix));
    }

    static int sol(int[][] matrix){
        ArrayList<String> islandShape = new ArrayList<>();
        helper(matrix, islandShape);
        return islandShape.size();
    }

    static void helper(int[][] matrix, ArrayList<String> islandShape){
        int i = 0;
        while (i < matrix.length){
            int j = 0;
            while (j < matrix[0].length){
                if (matrix[i][j] == 1){
                    String shape = islandIterator(matrix, i, j);
                    System.out.println(shape);
                    if (!islandShape.contains(shape)) islandShape.add(new String(shape));
                }
                j++;
            }
            i++;
        }

        for (i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length;j++){
                System.out.print(" | " + matrix[i][j] + " | ");   
            }
            System.out.println();
        }

        System.out.println(islandShape);
    }

    static String islandIterator(int[][] matrix, int i, int j){
        
        int[] dRow = new int[]{0,-1,0,1};
        int[] dCol = new int[]{-1,0,1,0};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        matrix[i][j] = 2;

        String path = "";
        
        while(!q.isEmpty()){
            
            Pair currPair = q.poll();
            int currI = currPair.i;
            int currJ = currPair.j;

            for (int l = 0; l < 4; l++){
                
                int nextI = currI + dRow[l];
                int nextJ = currJ + dCol[l];

                boolean isValid = nextI > -1 && nextI < matrix.length && nextJ > - 1 && nextJ < matrix[0].length;

                if (isValid && matrix[nextI][nextJ] == 1){
                    q.add(new Pair(nextI, nextJ));
                    matrix[nextI][nextJ] = 2;

                    if (dRow[l] == 0 && dCol[l] == -1) path += "L";
                    else if (dRow[l] == -1 && dCol[l] == 0) path += "U";
                    else if (dRow[l] == 1 && dCol[l] == 0) path += "D";
                    else path += "R";

                }

            }

        } 
        
        return path;
    }
}
