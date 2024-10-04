public class smallerOrEqualElements {
    static  int sol(int[] arr){
        int b = 4;
        int low = 0, high = arr.length - 1;

        if (arr[low] > b) return 0;
        if (arr[high] <= b) return high + 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println(low + " " + mid + " " + high);
            if (arr[mid] == b && arr[mid+1] > b){
                return mid + 1;
            }
            else if ((arr[mid] < b) || (arr[mid] == b && arr[mid + 1] == b)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low + " " + mid + " " + high);
        return -1;
        }


    public static void main(String[] args) {
        int[] arr = {1,3,4,4,6};
        System.out.println(sol(arr));
    }
}
