import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph21TopologicalSort {
    public static void main(String[] args) {
        
    }

    static int[] topologicalSort(ArrayList<ArrayList<Integer>> adjList){
        int[] retArr = new int[adjList.size()];
        int lastIndex = retArr.length - 1;
        boolean[] isVisited = new boolean[retArr.length];
        for (int i = 0; i < isVisited.length; i++){
            if (!isVisited[i]){
                lastIndex = topologicalSortDFS(adjList, retArr, i, lastIndex, isVisited);
            } 
        }

        boolean[] betterIsVisited = new boolean[adjList.size()];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < betterIsVisited.length; i++){
            if (!betterIsVisited[i]) betterTopologicalSortDFS(adjList, q, i, betterIsVisited);
        }
        int j = 0;
        while (!q.isEmpty()) retArr[j] = q.pop();
        return retArr;
    }

    static void betterTopologicalSortDFS(ArrayList<ArrayList<Integer>> adjList, Queue<Integer> q, int node, boolean[] betterIsVisited){
        ArrayList<Integer> neighboursList = adjList.get(node);
        for(Integer neighbour : neighboursList){
            if (!betterIsVisited[neighbour]){
                betterIsVisited[neighbour] = true;
                q.add(neighbour);
                betterTopologicalSortDFS(adjList, q, neighbour, betterIsVisited);
            }
        }
    }

    static int topologicalSortDFS(ArrayList<ArrayList<Integer>> adjList, int[] retArr, int node, int lastIndex, boolean[] isVisited){
        ArrayList<Integer> connectedNodes = adjList.get(node);
        if (connectedNodes.size() == 0){
            retArr[lastIndex] = node;
            return lastIndex - 1; 
        }

        for (Integer connNode : connectedNodes){
            isVisited[connNode] = true;
            lastIndex = topologicalSortDFS(adjList, retArr, connNode, lastIndex, isVisited)
        }

        retArr[lastIndex] = node;
        return lastIndex - 1;
    }



}
