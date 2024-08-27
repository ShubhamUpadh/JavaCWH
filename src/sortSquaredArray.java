import java.util.Arrays;

public class sortSquaredArray {
    public static void main(String[] args) {
        int[] arr = {51, -855, -847, -747, -708, -701, -667, -666, -618, -609, -536, -533, -509, -500, -396, -336, -297, -284, -229, -173, -173, -132, -38, -5, 35, 141, 169, 281, 322, 358, 421, 436, 447, 478, 538, 547, 644, 667, 673, 705, 711, 718, 724, 726, 811, 869, 894, 895, 902, 912, 942, 961};
        System.out.println(Arrays.toString(sol(arr)));
    }
    static int[] sol(int[] arr){
        int i = 0;

        for(; i < arr.length; i++){
            if (arr[i] >= 0) break;
        }

        if (i == 0){
            for (; i < arr.length; i++){
                arr[i] = arr[i] * arr[i];
                return arr;
            }
        }
        else{
            int[] newArr = new int[arr.length];
            int j = i - 1;

            for (int k = 0; k < arr.length; k++){
                if (i < arr.length && Math.abs(arr[i]) < Math.abs(arr[j])){
                    newArr[k] = arr[i] * arr[i];
                    i++;
                }
                else if (j > -1) {
                    newArr[k] = arr[j] * arr[j];
                    j--;
                }
            }
            return newArr;
        }
        return arr;

    }
}
