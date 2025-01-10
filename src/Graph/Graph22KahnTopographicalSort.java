package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Graph22KahnTopographicalSort {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) adjList.add(new ArrayList<>());
        adjList.get(0).addAll(Arrays.asList(4,5));
        adjList.get(1).addAll(Arrays.asList(3,4));
        adjList.get(2).addAll(Arrays.asList(5));
        adjList.get(3).addAll(Arrays.asList(2 ));
        // adjList.get(4).addAll(0000));
        // adjList.get(5).addAll(Arrays.asList(2));

        System.out.println(adjList);

        System.out.println(Arrays.toString(KahnBFS(adjList)));
    }

    static int[] KahnBFS(ArrayList<ArrayList<Integer>> adjList){
        
        System.out.println(adjList);
        int[] inEdges = new int[adjList.size()];
        int[] res = new int[adjList.size()];
        for (ArrayList<Integer> neighbours : adjList){
            for (Integer neighNode : neighbours){
                inEdges[neighNode]++;
            }
        }
        System.out.println(Arrays.toString(inEdges));

        Queue<Integer> q = new LinkedList<>();
        boolean[] added = new boolean[adjList.size()];

        for (int i = 0; i < inEdges.length; i++){
            if (inEdges[i] == 0){ 
                q.add(i);
                added[i] = true;
            }
        }
        System.out.println(q);
        int index = adjList.size() - 1;
        while (!q.isEmpty()){
            int a = q.poll();
            res[index--] = a;
            for (Integer node : adjList.get(a)){
                if (added[node]) continue;
                inEdges[node]--;
                if (inEdges[node] == 0) {
                    q.add(node);
                    added[node] = true;
                }
            }            
        }
        return res;
    }
}
