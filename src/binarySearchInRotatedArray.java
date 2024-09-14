import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearchInRotatedArray {
    static int sol(int[] arr){
        int low = 0, high = arr.length - 1;
        int mid;
        if (arr[0] < arr[arr.length-1]){
            return arr[0];
        }
        if (arr[arr.length-2] > arr[arr.length - 1]){
            return arr[arr.length - 1];
        }
        while (low <= high){
            mid = (low + high)/2;
            if (arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
                return arr[mid];
            }
            else if (arr[mid] < arr[arr.length-1]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    static int sol2(List<Integer> arr){
        int low = 0, high = arr.size() - 1;
        int mid;
        if (arr.getFirst() < arr.getLast()){
            return arr.getFirst();
        }
        if (arr.get(arr.size()-2) > arr.getLast()){
            return arr.getLast();
        }
        while (low <= high){
            mid = (low + high)/2;
            if (arr.get(mid) < arr.get(mid-1) && arr.get(mid) < arr.get(mid+1)){
                return arr.get(mid);
            }
            else if (arr.get(mid) < arr.getLast()){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4};
        System.out.println(sol(arr));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5,6,7,1,2,3,4));
        System.out.println(sol2(arr2));

    }
}
