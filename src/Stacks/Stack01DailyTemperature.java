package Stacks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Stack01DailyTemperature {
    public static void main(String[] args) {
        int[] temp = new int[]{30,40,50,60};
        System.out.println(Arrays.toString(dailyTemp(temp)));
    }

    static int[] dailyTemp(int[] temp){
        int[] dT = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < temp.length; i++){
            if (st.isEmpty()) {
                st.push(0);
                continue;
            }
            while (!st.isEmpty() && temp[st.peek()] < temp[i]){
                int id = st.pop();
                dT[id] = i - id;
            }
            st.push(i);
        }
        return dT;

    }
}
