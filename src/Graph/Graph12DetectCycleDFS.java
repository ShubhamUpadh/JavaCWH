package Graph;

import java.util.ArrayList;


public class Graph12DetectCycleDFS {
    
    static public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] isVisited = new boolean[adj.size()];
        
        for (int i = 0; i < adj.size(); i++){
            if (!isVisited[i]){
                boolean ret = helper(adj, isVisited, i, -1);
                if (ret) return true;
            }    
        }
        return false;
    }
    static boolean detectCycle(ArrayList<ArrayList<Integer>> adjList, boolean[] isVisited, int node, int parent){
        if (isVisited[node] == true) return true;
        isVisited[node] = true;
        ArrayList<Integer> adjacentNodes = adjList.get(node);
        for (Integer i : adjacentNodes){
            if (!isVisited[i]){
                if (detectCycle(adjList, isVisited, i, node) == true){
                    return true;
                }
            }
            else if (isVisited[i] && parent != i) return true;
        }
        return false;
    }
}
