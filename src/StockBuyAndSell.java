public class StockBuyAndSell {
    public static int maxProfit(int[] arr){
        int[] maxRight = new int[arr.length];
        maxRight[arr.length - 1] = arr[arr.length - 1];
        int maxProf = 0;

        for (int i = arr.length-2; i > -1; i--){
            maxRight[i] = Math.max(arr[i], maxRight[i+1]);
        }

        for (int i = 0; i < arr.length - 1; i++){
            maxProf = Math.max(maxProf,maxRight[i]-arr[i]);
        }

        return maxProf;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
