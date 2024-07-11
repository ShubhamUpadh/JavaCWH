public class minimumOverlappingSubintervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        System.out.println(solution(arr));

    }
    static int solution(int[][] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] a : arr){
            if (max < a[0]){
                max = a[0];
            }
            if (min > a[1]){
                min = a[1];
            }
        }
        int span = Math.max(min,max) + 1 - Math.min(min,max) + 1;
        return span + 1;
    }
}
