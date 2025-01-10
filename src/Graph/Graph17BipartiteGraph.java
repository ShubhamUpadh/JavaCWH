package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Treble{
    int curr;
    int parent;
    int color;
    public Treble(int curr, int parent, int color){
        this.curr = curr;
        this.parent = parent;
        this.color = color;
    }
}

public class Graph17BipartiteGraph {
    public static void main(String[] args) {
        
    }

    static boolean isBipartite(ArrayList<ArrayList<Integer>> adjList){
        
        boolean isBipartite = true;
        
        int[] isVisited = new int[adjList.size()];

        //colours = 1,-1 , not visited = 0

        for (int i = 0; i < isVisited.length; i++){
            if (isVisited[i] == 0){
                isBipartite = BFSTraversal(adjList, isVisited, i);
                if(!isBipartite) return true;
            }
        }
        return isBipartite;
    }

    static boolean BFSTraversal(ArrayList<ArrayList<Integer>> adjList, int[] isVisited, int i){
        
        Queue<Treble> q = new LinkedList<>();

        q.add(new Treble(i, -1, 1));
        isVisited[i] = 1; // colored i with  color 1

        while (!q.isEmpty()){
            Treble currTreble = q.poll();
            int currNode = currTreble.curr;
            int currParent = currTreble.parent;
            int currColor = currTreble.color;
            int nextColor = currColor == 1 ? -1 : 1;
            
            ArrayList<Integer> connectedNodes = adjList.get(currNode);

            for (Integer nd : connectedNodes){
                if (isVisited[nd] == 0) q.add(new Treble(nd, currNode, nextColor));
                else if (nd != currParent && currColor == isVisited[nd]) return false;  
                // this means the node is not a parent -> in a cycle and the color of node = current color 
            }
        }
        return true;
    }
}
