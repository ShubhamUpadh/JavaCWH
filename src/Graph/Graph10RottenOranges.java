package Graph;
import java.util.LinkedList;
import java.util.Queue;

class Treble{
    int i;
    int j;
    int time;
    public Treble(int i, int j, int time){
        this.i = i;
        this.j = j;
        this.time = time;
    }
}

public class Graph10RottenOranges {
    public static void main(String[] args) {
        
    }

    static int timeToRot(int[][] matrix){
        int time = 0;

        Queue<Treble> q = new LinkedList<>();
        int[][] isVis = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 2) q.add(new Treble(i, j,0));
            }
        }

        int[] dRow = new int[]{-1,0,1,0};
        int[] dCol = new int[]{0,-1,0,-1};

        while (!q.isEmpty()){
            
            // Treble currTreble = q.poll();
            int i = q.peek().i;
            int j = q.peek().j;
            int ctime = q.peek().time;
            time = Math.max(time, ctime);
            // isVis[i][j] = 2; // this should be done when including in the queue, in order to avoid duplicates
            q.poll();
            

            for (int k = 0; k < 4; k++){
                int nextI = i + dRow[k];
                int nextJ = j + dCol[k];
                boolean isValid = nextI > 0 && nextI < matrix.length && nextJ > 0 && nextJ < matrix.length;
                if (isValid && matrix[nextI][nextJ] == 1 && isVis[nextI][nextJ] != 2){
                    q.add(new Treble(nextI, nextJ, ctime+1));
                    isVis[nextI][nextJ] = 2;        // mark here itself because we nee to ensure that no duplicates are taken
                }
            }
            // if (i > 0 && matrix[i-1][j] == 1 && isVis[i-1][j] != 2 && matrix[i-1][j] == 1) q.add(new Treble(i-1, j, ctime + 1));
            // if (j > 0 && matrix[i][j-1] == 1 && isVis[i][j-1] != 2 && matrix[i][j-1] == 1) q.add(new Treble(i, j-1, ctime + 1));
            // if (i <  matrix[0].length-1 && matrix[i+1][j] == 1 && isVis[i+1][j] != 2  && matrix[i+1][j] == 1) q.add(new Treble(i+1, j, ctime + 1));
            // if (j <  matrix.length-1 && matrix[i][j+1] == 1 && isVis[i][j+1] != 2 && matrix[i][j+1] == 1) q.add(new Treble(i, j+1, ctime + 1));
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 1 && isVis[i][j] != 2) return -1;
            }
        }

        return time;
    }

    // static void helper(int[][] matrix, Queue<Treble> q,)
}
