public class bitManipulationSingleDigit {
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,2,3,3,2,3,4};
        System.out.println(singleDigit(arr));
    }
    static int singleDigit(int[] arr){
        int ones = 0;
        int twos = 0;
        for (int num : arr){
            ones = (ones^num) & ~twos;
            twos = (twos^num) & ~ones;
        }
        return ones;

    }
}
