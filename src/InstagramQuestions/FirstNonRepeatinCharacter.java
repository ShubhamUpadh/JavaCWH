package InstagramQuestions;

public class FirstNonRepeatinCharacter {
    public static void main(String[] args) {
        String st = "swiss";
        System.out.println(sol(st));
    }
    static char sol(String st){

        int[] arr = new int[26];

        for (char a : st.toCharArray())  arr[a - 'a']++;

        for (char a : st.toCharArray()){
            if (arr[a - 'a'] == 1){
                return a;
            }
        }
        return '1';


    }
}
