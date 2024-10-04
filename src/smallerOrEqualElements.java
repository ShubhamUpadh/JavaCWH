public class smallerOrEqualElements {
    static  int sol(int[] arr, int b){
        //int b = 4;
        int low = 0, high = arr.length - 1;

        if (arr[low] > b) return 0;
        if (arr[high] <= b) return high + 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println(low + " " + mid + " " + high);
            if ((arr[mid] == b && arr[mid+1] > b) || (arr[mid] < b && arr[mid + 1] > b)){
                System.out.println("Case 1");
                return mid + 1;
            }
            else if (arr[mid] > b && arr[mid - 1] < b){
                System.out.println("Case 2");
                return mid;
            }
            else if ((arr[mid] < b) || (arr[mid] == b && arr[mid + 1] == b)) {
                System.out.println("Case 3");
                low = mid + 1;
            } else {
                System.out.println("Case 4");
                high = mid - 1;
            }
        }

        System.out.println(low + " " + mid + " " + high);
        return -1;
        }


    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 6, 6, 6, 6, 6, 7};
        System.out.println(sol(arr,2));
    }
}
