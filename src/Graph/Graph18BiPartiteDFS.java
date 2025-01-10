package Graph;

import java.util.ArrayList;

public class Graph18BiPartiteDFS {
    public static void main(String[] args) {
        
    }

    static boolean isBipartiteDFS(ArrayList<ArrayList<Integer>> adjList){
        int[] isVisited = new int[adjList.size()];
        boolean isBipartite = true;

        for (int i = 0; i < isVisited.length; i++){
            if (isVisited[i] == 0){
                isVisited[i] = 1;
                isBipartite = isBipartiteDFSHelper(adjList, isVisited, i);
                if (!isBipartite) return isBipartite;
            }
        }
        return isBipartite;
    }

    static boolean isBipartiteDFSHelper(ArrayList<ArrayList<Integer>> adjList, int[] isVisited, int node){

        ArrayList<Integer> connNodes = adjList.get(node);
        int nextColor = isVisited[node] == 1 ? -1 : 1;
        for (Integer nextNode : connNodes){
            if (isVisited[nextNode] != 0 && isVisited[nextNode] == isVisited[node]){
                return false;
                // this means that the nextnode is already visited with the same color as the current node
            }
            else if (isVisited[nextNode] == 0){
                
                isVisited[nextNode] = nextColor;
                if (!isBipartiteDFSHelper(adjList, isVisited, node)) return false;;
            }
        }

        return true;
    }
}
