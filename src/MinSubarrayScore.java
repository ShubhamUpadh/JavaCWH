public class MinSubarrayScore {
    public static long helper(long[] arr){
        long minV = Long.MAX_VALUE - 1, minnest = Long.MAX_VALUE;

        for (long l : arr) {
            if (l < minnest) {
                minV = minnest;
                minnest = l;
            } else if (l < minV) {
                minV = l;
            }
        }
        return minV + minnest;
    }

    public static void main(String[] args) {
        long[] arr = {4, 3, 1, 5, 6};
        System.out.println(helper(arr));
    }
}
