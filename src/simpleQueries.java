import java.util.*;

public class simpleQueries {

    static int prodDiv(int num){
        int prod = 1;
        for (int i = 1; i < Math.sqrt(num) + 1; i++){
            if (num % i == 0){
                if (num/i == i) prod *= i;
                else prod = prod * (i) * (num / i);
            }
        }
        return prod;
    }

    static ArrayList<Integer> value(int[] arr){
        ArrayList<Integer> G = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                int index = stack.pop();
                G.add(arr[index]); // This element is the maximum for all subarrays ending at 'i'
            }
            stack.push(i);
        }

        // Process remaining elements in the stack
        while (!stack.isEmpty()) {
            G.add(arr[stack.pop()]);
        }

        return G;
        /*
        ArrayList<Integer> G = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            int maxV = arr[i];
            for (int j = i; j < arr.length; j++){
                maxV = Math.max(maxV, arr[j]);
                G.add(maxV);
            }
        }

        for (int i = 0; i < G.size(); i++){
            int num = G.get(i);
            int prodDiv = prodDiv(num);
            G.set(i,prodDiv);
        }
        G.sort(Comparator.reverseOrder());

        return G;
        */

//        System.out.println(G);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        System.out.println("Enter the array elements");

        int[] arr = {1,2,4};

        ArrayList<Integer> G =  value(arr);

        System.out.println(G);

//        int[] arr2 = {1,2,3,4,5,6};
//
//        for (int i : arr2){
//            if (i < G.size())  System.out.println(G.get(i));
//        }
    }
}
