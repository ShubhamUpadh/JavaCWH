package stringQues;

public class Strings01LongestPalindrome {
    static String sol(String s){
        if (s == null && s.length() < 1) return s;

        int maxP = -1;
        int maxLen = -1;
        String retStr = "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++){
            int evenLen = expand(s, i, i);
            int oddLen = expand(s, i, i+1);

            maxLen = Math.max(oddLen,evenLen);

            if (maxLen > maxP){
                start = i -(maxLen-1)/2;
                end = i + maxLen/2;

            }

        }
        return s.substring(start, end);
        // return "354";
    }

    static int expand(String s, int left, int right){

        while (left < -1 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

}
