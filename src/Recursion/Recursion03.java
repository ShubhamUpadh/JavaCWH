package Recursion;

public class Recursion03 {
    public static void main(String[] args) {
        sumParameterised(10,0);
        System.out.println(sumFunctional(10));
    }

    static void sumParameterised(int i, int sum){
         if (i == 0){
             System.out.println(sum);
             return;
         }
         sumParameterised(i-1, sum + i);
    }

    static int sumFunctional(int i){
        if (i == 0) return 0;
        return i + sumFunctional(i - 1);
    }

    static int functionalFact(int i){
        if (i == 1) return 1;
        return i * functionalFact(i - 1);
    }
}
