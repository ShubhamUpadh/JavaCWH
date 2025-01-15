package Graph;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
public class Graph23CycleInDirectedGraph {
    public static void main(String[] args) {
        
    }

    static boolean cycleInDirectedGraph(ArrayList<ArrayList<Integer>> adjList){
        boolean isCyclic = false;
        boolean[] isVisited = new boolean[adjList.size()];

        //create inedges list
        int[] inEdgesArr = new int[adjList.size()];

        for (ArrayList<Integer> neighbours : adjList){
            for(Integer node : neighbours) inEdgesArr[node]++;
        }

        // Start the queue that will contain all nodes with 0 inEdges
        Queue<Integer> q = new LinkedList<>();
        
        Set<Integer> parentSet = new HashSet<>();
        for (int i = 0; i < inEdgesArr.length; i++){
            if (inEdgesArr[i] == 0){ 
                q.add(i);
                isVisited[i] = true;
                parentSet.add(i);
            }
        }

        if (q.isEmpty()) return false;

        //Start going through the queue

        while(!q.isEmpty()){
            int s = q.size();
            Set<Integer> tempSet = new HashSet<>();
            while (s > 0){
                int node = q.poll();
                tempSet.add(node);
                for (Integer neighbour : adjList.get(node)){
                    if (isVisited[neighbour] && parentSet.contains(neighbour)) continue; // all good
                    else if (isVisited[neighbour] && !parentSet.contains(neighbour)) return true;
                    else{
                        q.add(neighbour);
                        isVisited[neighbour] = true;
                    }
                    // q.add(neighbour);
                }
                s--;
            }
            parentSet = tempSet;
        }
        return isCyclic;
    }

    static boolean isCyclic(ArrayList<ArrayList<Integer>> adjList){
        //if there is toposort of size adjList.size()?
        
        int[] inEdges = new int[adjList.size()];

        for (ArrayList<Integer> nNodes : adjList){
            for (Integer n : nNodes){
                inEdges[n]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited = new boolean[adjList.size()];

        for (int i = 0; i < inEdges.length; i++){
            if (inEdges[i] == 0){
                q.add(i);
            }
        }

        for (int i = 0; i < inEdges.length; i++){
            if (inEdges[i] == 0){ 
                q.add(i);
                isVisited[i] = true;
            }
        }
        ArrayList<Integer> topoSort = new ArrayList<>();

        while (!q.isEmpty()){
            int node = q.poll();
            topoSort.add(node);
            for (Integer nd : adjList.get(node)){
                q.add(nd);
                isVisited[nd] = true;
                inEdges[nd]--;
            }
        }
        return topoSort.size() == adjList.size();
    }
}
