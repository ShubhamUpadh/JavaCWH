public class rotatedArrayBS {
    public static void main(String[] args) {
        int[] arr = {12,17,0,1,2,3,4,5,6};
        int k = 5;
        System.out.println(sol(arr,k));
        //System.out.println(bs(arr,0, arr.length - 1, k));
        //System.out.println(arr[arr.length - 1]);
    }
    static int bs(int[] arr, int low, int high, int target){
        if ((target < arr[low]) || (target > arr[high])){
            return -1;
        }
        if (arr[0] == target) return 0;
        if (arr[high] == target) return high;

        while (low <= high){
            int mid = (low+high)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
    static int sol(int[] arr, int target){
        if (arr[0] < arr[arr.length - 1]){
            System.out.println("I'm here");
            return bs(arr, 0, arr.length - 1, target);
        }
        if (arr[arr.length - 2] > arr[arr.length - 1]){
            int left = bs(arr, 0, arr.length  - 2, target);
            int right = bs(arr, arr.length - 1, arr.length - 1, target);
            System.out.println(left +" " + right);
            return Math.max(left,right);
        }

        int low = 0, high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if ((arr[mid] < arr[mid + 1]) &&(arr[mid] < arr[mid - 1])){
                int left = bs(arr, 0, mid - 1, target);
                int right = bs(arr, mid, arr.length - 1, target);
                return Math.max(left,right);
            }
            else if (arr[mid] > arr[0]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;

    }
}
