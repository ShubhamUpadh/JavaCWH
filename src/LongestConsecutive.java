import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutive {
    static int longestConSeq(int[] arr){
        Arrays.sort(arr);
        int maxLen = 0, currLen = 1;

        if (arr.length == 1){
            return 1;
        }

        for (int i = 1; i < arr.length - 1; i++){
            if (arr[i-1] + 1 == arr[i]){
                currLen++;
            }
            else if (currLen != 0) {
                maxLen = Math.max(currLen, maxLen);
                currLen = 1;
            }
        }
        //maxLen = Math.max(currLen, maxLen);
        return (maxLen > currLen) ? maxLen : currLen;
    }

    static int longestConsec(int[] arr){
        int[] freqMap = new int[Arrays.stream(arr).max().getAsInt()+1];

        for (int i = 0; i < arr.length; i++){
            freqMap[arr[i]]++;
        }

        for (int j = 0; j < freqMap.length; j++){
            if (freqMap[j] !=0) System.out.print(j + " " + freqMap[j] +", ");
        }

        int maxLen = 0, currLen = 1;

        for (int i = 0; i < freqMap.length-1; i++){
            if (freqMap[i] !=0){
                currLen++;
            }
            else{
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }

        return Math.max(currLen, maxLen);

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        System.out.println(longestConsec(arr));
    }
}
