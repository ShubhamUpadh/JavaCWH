package Recursion;

public class Recursion14 {
    public static void main(String[] args) {
        // System.out.println(isNumber('0'));
        // System.out.println(isNumber('a'));
        UpperLowerPermutations("abc", 0, ""); //,"", false);
    }

    static void allPermutationsUpperLower(String str, int index, String lst, String ust, boolean debug){
        if (debug) System.out.println(index + " | " + ust + " | " + lst);
        if (index == str.length()) {
            System.out.println(lst);
            System.out.println(ust);
            return;
        }
        for (int i = index; i < str.length(); i++){
            // String forwardStr = "" + st;
            if (isNumber(str.charAt(i))){
                String chr = Character.toString(str.charAt(i));
                lst = lst + Character.toString(str.charAt(i));
                ust = ust + Character.toString(str.charAt(i));
                allPermutationsUpperLower(str, i + 1, lst, ust , debug);
                // lst
                if (debug) System.out.println("Here");
                continue;
            }      
            char curr = str.charAt(i);
            ust = ust +  Character.toString(Character.toUpperCase(curr));
            lst = lst +  Character.toString(Character.toLowerCase(curr));
            allPermutationsUpperLower(str, i + 1,lst, ust, debug);
            //allPermutationsUpperLower(str, i + 1, lst, debug);
        }
    }

    static void UpperLowerPermutations(String str, int index, String ds){
        if (index == str.length()){
            System.out.println(ds);
            return;
        }

        if (isNumber(str.charAt(index))){
            UpperLowerPermutations(str, index + 1, ds + Character.toString(str.charAt(index)));
        }
        else{
        char curr = Character.toLowerCase(str.charAt(index));
        UpperLowerPermutations(str, index+1, ds + Character.toString(Character.toUpperCase(curr)));

        UpperLowerPermutations(str, index+1, ds + Character.toString(curr));            
    }}

    static boolean isNumber(char a){
        try{
            int ret = Integer.parseInt(Character.toString(a));
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
