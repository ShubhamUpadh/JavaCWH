public class SetZeroes {
    static int setZeroes(int[][] matrix){
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    row[i] = -1;
                    column[j] = -1;
                }
            }

        }
        return 10;
    }
    public static void main(String[] args) {

    }
}
