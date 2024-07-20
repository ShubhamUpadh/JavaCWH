public class maxMin {
    public static void main(String[] args) {

    }
    static int solution(int[] arr){
        int mins = arr[0], maxs = arr[0];
        for (int i = 1; i < arr.length; i++){
            mins = Math.min(mins, arr[i]);
            maxs = Math.max(maxs, arr[i]);
        }
        return mins + maxs;
    }
}
