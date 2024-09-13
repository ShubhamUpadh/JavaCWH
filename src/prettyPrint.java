import java.util.Arrays;

public class prettyPrint {
    static int[][] solution(int A){
        int[][] ans = new int[2*A-1][2*A-1];
        int temp = A;
        while (temp > 0){
            for (int i = (A - temp); i < ans.length - (A - temp); i++){
                for (int j = A - temp; j < ans.length - (A - temp); j++){
                    ans[i][j] = temp;
                }
            }
            temp--;
        }
        return ans;
    }

    static int[][] solution2(int A){
        int[][] arr = new int[2*A-1][2*A-1];
        int temp = A;
        for (int i = 0; i < A - 1; i++){
            for (int j = i; j < A - 1; j++){
                arr[i][j] = temp;
            }
            for (int j = i; j < A - 1; j++){
                arr[j][i] = temp;
            }
            temp--;
        }

        for (int i = 0; i < A; i++){
            arr[i][A-1] = A - i;
        }
        for (int i = 0; i < A; i++){
            arr[A-1][i] = A - i;
        }

        for (int i = 0; i < A; i++){
            for (int j = 0; j < A; j++){
                arr[2*A - 1 - i - 1][j] = arr[i][j];
            }
        }

        for (int i = 0; i < 2*A - 1; i++){
            for (int j = 0; j < A; j++){
                arr[i][2*A - 1 - j - 1] = arr[i][j];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] val = solution2(4);
        for (int i = 0; i < val.length; i++){
            for (int j = 0; j < val.length; j++){
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }
    }
}
