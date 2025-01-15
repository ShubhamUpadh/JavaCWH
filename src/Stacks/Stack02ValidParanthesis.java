package Stacks;

import java.util.Stack;

public class Stack02ValidParanthesis{
    public static void main(String[] args) {
        isValid("[(({})}]");   
    }

    public static boolean isOpenBrack(char c){
        return c == '(' || c == '[' || c == '{';
    }
    public static boolean matchingCloseBrack(char c, char d){
        if (c == ')' && d != '(') return false;
        else if (c == ']' && d != '[') return false;
        else if (c == '}' && d != '{') return false;
        return true;
    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (isOpenBrack(s.charAt(i))) st.add(s.charAt(i));
            else if (matchingCloseBrack(s.charAt(i), st.peek())) st.pop();
            else return false;
            System.out.println(st);
        }

        if (!st.isEmpty()) return false;
        return true;
    }
}