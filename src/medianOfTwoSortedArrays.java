import static java.lang.Math.max;

public class medianOfTwoSortedArrays {
    static double sol(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        if (n1 > n2) return sol(arr2, arr1);
        int n = n1 + n2;
        int low = 0, high = n1 - 1;
        //int mid;
        int left = (n1 + n2 + 1) / 2;
        while (low <= high){
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 > n1) r1 = arr1[mid1];
            if (mid2 > n2) r2 = arr2[mid2];
            if (mid1 > 0) l1 = arr1[mid1 - 1];
            if (mid2 > 0) l2 = arr2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1){
                return (n % 2 == 0) ? (double) (max(r1,r2) + max(l1, l2))/2.0: max(l1, l2);
            }
            else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 10d;
    }
    public static void main(String[] args) {

    }
}
