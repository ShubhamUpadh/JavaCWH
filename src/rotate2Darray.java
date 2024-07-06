public class rotate2Darray {
    public static void transposeFunction(int[][] arr, int m, int n) {
        if (m != n) {
            return;
        }
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        transposeFunction(arr, 2, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //System.out.println(Arrays.toString(arr));
}
