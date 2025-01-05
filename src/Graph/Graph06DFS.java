package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph06DFS {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < 9; i++) adjList.add(new ArrayList<Integer>());

        adjList.get(1).addAll(Arrays.asList(2,3));
        adjList.get(2).addAll(Arrays.asList(1,5,6));
        adjList.get(3).addAll(Arrays.asList(1,4,7));
        adjList.get(4).addAll(Arrays.asList(3,8));
        adjList.get(5).addAll(Arrays.asList(2));
        adjList.get(6).addAll(Arrays.asList(2));
        adjList.get(7).addAll(Arrays.asList(3,8));
        adjList.get(8).addAll(Arrays.asList(4,7));

        System.out.println(adjList);

        recursiveDFS(adjList, 3, new boolean[adjList.size()]);
    }

    static void recursiveDFS(ArrayList<ArrayList<Integer>> adjList, int startPoint, boolean[] isVisited){
        
        System.out.print(startPoint +", ");
        isVisited[startPoint] = true;

        ArrayList<Integer> ls = adjList.get(startPoint);

        for (Integer i : ls){
            if (!isVisited[i]) recursiveDFS(adjList, i, isVisited);
        }
        return;
    }



    
}
