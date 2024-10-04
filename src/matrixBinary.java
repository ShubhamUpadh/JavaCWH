public class matrixBinary {
    static int subarraySearch(int[] A, int b){
        int low = 0, high = A.length - 1;
        while (low <= high){
            int mid = (low+high) / 2;
            if (A[mid] == b) return 1;
            else if (A[mid] > b) high = mid - 1;
            else low = mid + 1;
        }
        return 0;
    }
    static int matrixSearch(int[][] A, int b){
        int low = 0, high = A.length - 1;
        int mid;
        int size = A[0].length;
        System.out.println("Here");
        while (low <= high){
            mid = (low+high)/2;
            System.out.println(low + " " + mid + " " + high);
            if (A[mid][size - 1] >= b && A[mid][0] <= b){
                System.out.println("Subarray found");
                return subarraySearch(A[mid], b);

            }
            else if (A[mid][0] > b) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] A = {{1,3,5,7}, {10, 11, 16,20}, {23,30,34,50}};
        int b = 50;
        System.out.println(matrixSearch(A,b));
    }
}
