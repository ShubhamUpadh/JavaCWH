package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recursion21 {

    public static void main(String[] args) {
        System.out.println(sol(""));
    }
    static List<String> sol(String digits){
        if (digits == "") return null;

        List<String> res = new ArrayList<>();
        HashMap<String, String> keyChoices = new HashMap<>();

        keyChoices.put("2","abc");
        keyChoices.put("3", "def");
        keyChoices.put("4","ghi");
        keyChoices.put("5", "jkl");
        keyChoices.put("6", "mno");
        keyChoices.put("7","pqrs");
        keyChoices.put("8", "tuv");
        keyChoices.put("9","wxyz");

        helper(digits, keyChoices, "", res);
        // String currChoices = keyChoices.get(String.valueOf(digits.charAt(0)));
        // System.out.println(currChoices);
        return res;
    }

    static void helper(String digits, HashMap<String,String> keyChoices, String ds, 
    List<String> res){
        System.out.println("Going here");
        if (digits.length() == 0){
            res.add(ds);
            return;
            // return res;
        }
        // System.out.println(ds + " | " + digits + " | " + digits.length());

        String currChoices = keyChoices.get(String.valueOf(digits.charAt(0)));

        for (int i = 0; i < currChoices.length(); i++){
            String c = String.valueOf(currChoices.charAt(i));
            helper(digits.substring(1), keyChoices, ds + c, res);
        }
    }
}
