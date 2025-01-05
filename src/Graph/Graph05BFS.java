package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph05BFS {
    public static void main(String[] args) {
        
    }

    static void BFSTraversal(int start, ArrayList<ArrayList<Integer>> adjList){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        boolean[] isVisited = new boolean[adjList.size()];
        //isVisited[start] = true;

        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                int node = q.poll();
                if (isVisited[node]) continue;
                isVisited[node] = true;
                List<Integer> connectedNodes = adjList.get(node);
                connectedNodes = connectedNodes.stream().filter(b -> isVisited[b] == false).toList();
                q.addAll(connectedNodes); 
            }
        }
    }
}
