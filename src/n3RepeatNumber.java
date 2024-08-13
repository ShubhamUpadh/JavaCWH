import java.util.Arrays;

public class n3RepeatNumber {
    static int sol1(int[] arr){
        int candidate1 = 0, candidate2 = 0;
        int count1 =0, count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == candidate1 && count1 != 0){
                count1++;
            } else if (arr[i] == candidate2 && count2 != 0) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = arr[i];
                count1++;
            } else if (count2 == 0) {
                candidate2 = arr[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        System.out.println("Candidate1 = " + candidate1 +", count1 = "+ count1);
        System.out.println("Candidate2 = " + candidate2 +", count2 = "+ count2);
        count1 = count2 = 0;
        for (int i : arr){
            if (i == candidate1){
                count1++;
                if (count1 > arr.length/3) return candidate1;
            } else if (i == candidate2) {
                count2++;
                if (count2 > arr.length/3) return candidate2;
            }
        }
        return -1;

    }
    static int sol(int[] arr) {
        int max = arr[0];
        for (int i : arr) max = i > max ? i : max;
        max++;
        for (int i = 0; i < arr.length; i++){
            arr[arr[i] % max] = arr[arr[i] % max] + max;

            if (arr[arr[i]%max] / max >= arr.length/3){
                return arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 3, 4, 5, 3, 6, 3};
        //sol1(arr);
        System.out.println(sol1(arr));
    }
}
