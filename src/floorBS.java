public class floorBS {
    static int findFloor(int[] arr, int x){
        if (arr[0] > x){
            return -1;
        }
        if (arr[arr.length-1] < x){
            return arr[arr.length-1];
        }
        int low = 0, high = arr.length-1;
        int temp, mid;

        while (low <= high){
            temp = (low+high)/2;
            mid = arr[temp];
            if (mid == x){
                return temp;
            }
            else if (mid > x){
                high = temp - 1;
            }
            else{
                low = temp + 1;
            }
        }
        return low-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        System.out.println(arr[findFloor(arr,13)]);
    }
}
