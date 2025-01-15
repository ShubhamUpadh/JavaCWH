package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int node;
    int weight;
    public Pair(int node, int weight){
        this.node = node;
        this.weight = weight;
    }
}

public class Graph26ShortestPathInDAG {
    public static void main(String[] args) {
        
    }

    static int[] shortestPath(ArrayList<ArrayList<Pair>> adjList, int source){
        
        ArrayList<Integer> topoSort = topoSort(adjList);
        int[] distance = new int[adjList.size()];

        for (int i = 0; i < distance.length; i++) distance[i] = Integer.MAX_VALUE;
        
        while (true){   // removed all the nodes that occur before source because we can't reach those nodes anyways
            if (topoSort.get(0) != source) topoSort.remove(0);
            else break;
        }

        distance[source] = 0;

        while (topoSort.size() > 0){
            int currNode = topoSort.get(0);
            for (Pair pair : adjList.get(currNode)){
                distance[pair.node] = Math.min(distance[currNode] + pair.weight, distance[pair.node]);
            }
            topoSort.remove(0);
        }

        return distance;

    }

    
}
