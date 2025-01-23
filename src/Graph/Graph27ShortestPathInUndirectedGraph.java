package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph27ShortestPathInUndirectedGraph {
    public static void main(String[] args) {
        
    }

    static int[] shortestPath(ArrayList<ArrayList<Integer>> adjList, int source){
        
        int[] distance = new int[adjList.size()];
        for (int i = 0; i < distance.length; i++) distance[i] = Integer.MAX_VALUE;
        distance[source] = 0;
        boolean[] isVisited = new boolean[adjList.size()];
        isVisited[source] = true;

        Queue<Integer> q = new LinkedList<>();
        
        q.add(source);

        while (!q.isEmpty()){
            int currNode = q.poll();
            for (int node : adjList.get(currNode)){
                if (!isVisited[node]){
                    distance[node] = distance[currNode] + 1;
                    q.add(node);
                    isVisited[node] = true;
                }
            }
        }

        return distance;
    }
}
