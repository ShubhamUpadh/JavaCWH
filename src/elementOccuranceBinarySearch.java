public class elementOccuranceBinarySearch {
    static int solution(int[] arr, int target){
        int firstOcc = -1, lastOcc = -1;

        if (arr[0] == target) firstOcc = 0;
        if (arr[arr.length-1] == target) lastOcc = arr.length - 1;

        if (firstOcc == -1){
            int low = 0, high = arr.length - 1;
            int mid;
            while (low <= high){
                mid = (low+high)/2;
                if (arr[mid] == target && arr[mid-1] != target){
                    firstOcc = mid;
                    break;
                }
                else if (arr[mid] < target) {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        if (lastOcc == -1){
            int low = 0, high = arr.length - 1;
            int mid;
            while (low <= high){
                mid = (low+high)/2;
                if (arr[mid] == target && arr[mid+1] != target){
                    lastOcc = mid;
                    break;
                }
                else if (arr[mid] > target) {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        System.out.println(firstOcc + " " + lastOcc);
        return lastOcc - firstOcc + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5 ,6 ,6 ,6 ,8};
        int val = 6;
        System.out.println(solution(arr,val));
    }
}
