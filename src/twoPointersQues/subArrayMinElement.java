package twoPointersQues;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
// import java.util.Queue;

public class subArrayMinElement {
    public static void main(String[] args) {
        System.out.println(sol(new int[]{100,200,1}, 1));
    }

    static ArrayList<Integer> sol(int[] arr, int k){
        
        if (arr.length < k) return new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++){
            if (q.isEmpty()) q.add(i);
            else{
                while (!q.isEmpty() && arr[q.getLast()] >= arr[i]){
                    q.removeLast(); 
                }
                q.add(i);
            }
        }

        ans.add(arr[q.peek()]);

        int p1 = 0, p2 = k;

        while (p2 < arr.length){
            if (q.peek() == p1){
                q.poll();
            }
            if (q.isEmpty()) q.add(p2);
            else{
                while (!q.isEmpty() && arr[q.getLast()] >= arr[p2]) q.removeLast();
            }
            q.add(p2);
            ans.add(arr[q.peek()]);
            p1++;
            p2++;
            
        }

        return ans;

    }
}
