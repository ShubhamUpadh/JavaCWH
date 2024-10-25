import java.util.Arrays;

public class bitManipulation4 {
    public static void main(String[] args) {
        int[] arr = {10,10,10, 15};
        System.out.println(sol(arr));
    }
    static int sol(int[] arr){
        int[] res = new int[32];
        for (int i : arr){
            int counter = 0;
            while (i > 0){
                if (i%2 != 0){
                    res[counter]++;
                }
                counter++;
                i = i>>1;
            }
        }
        int ans = 0;
        for (int j = 0; j < res.length;j++){
            if (res[j]%3 != 0) ans += (int) Math.pow(2, j * (res[j]% 3));

        }
        System.out.println(Arrays.toString(res));

        return ans;
    }
}
