package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph33BellmanFord {
    public static void main(String[] args) {
        
    }

    public static int[] bellmanFord(int V, ArrayList<ArrayList<Integer>> edges, int S){
        
        int[] dist = new int[V];
        Arrays.fill(dist,(int) Math.pow(10, 8));
        dist[S] = 0;
        int i;
        for (i = 0; i < V; i++){
            boolean anyUpdate = false;

            for (ArrayList<Integer> edge : edges){
                int source = edge.get(0);
                int destination = edge.get(1);
                int weight = edge.get(2);
                if (dist[source] + weight < dist[destination]){
                    anyUpdate = true;
                    dist[destination] = dist[source] + weight;
                }
            }

            if (!anyUpdate) break;
        }

        return dist;
    }
}
