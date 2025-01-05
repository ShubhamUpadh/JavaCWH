package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph11DetectCycleBFS {
    public static void main(String[] args) {
        
    }
     
    // Function to detect cycle in an undirected graph.
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] isVisited = new boolean[adj.size()+1];
        for (int i = 0; i < adj.size(); i++){
            if (!isVisited[i]){
                isVisited[i] = true;
                // System.out.println("Calling for " + i);
                if (detectCycle(adj, i, isVisited)) return true;   
            }
        }
        return false;
    }
    
    public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj,
    int st, boolean[] isVisited){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(st, -1));
        isVisited[st] = true;
        
        while (!q.isEmpty()){
            Pair currPair = q.poll();
            ArrayList<Integer> next = adj.get(currPair.node);
            for (int ls : next){
                Pair addPair = new Pair(ls,currPair.node);
                if (!isVisited[ls]){
                    q.add(addPair);
                    isVisited[ls] = true;
                }
                else if (currPair.cameFrom != ls){
                    return true;
                }
            }
        }
        // System.out.println(Arrays.toString(isVisited));
        return false;
    }
}
