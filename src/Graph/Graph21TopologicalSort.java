import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    static int[] topologicalSortBFS(List<List<Integer>> ls){
        
        Queue<Integer> q = new LinkedList<>();
        int[] inEdges = new int[ls.size()];

        for (int i = 0; i < ls.size(); i++){
            for(int node : ls.get(i)){
                inEdges[node]++;
            }
        }

        for (int i = 0; i < inEdges.length; i++){
            if (inEdges[i] == 0) q.add(i);
        }

        int[] sorted = new int[ls.size()];
        int index = 0; 
        boolean[] isAdded = new boolean[ls.size()];

        while (!q.isEmpty()){
            int curr = q.poll();
            sorted[index] = curr;
            index++;
            for (int node : ls.get(curr)){
                if (isAdded[node]) continue;
                if (!isAdded[node]){
                    inEdges[node]--;
                    if (inEdges[node] == 0){
                        q.add(node);
                        isAdded[node] = true;
                    }
                }
            }
        }

        return sorted;
    }



}
