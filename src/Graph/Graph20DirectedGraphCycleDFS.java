package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graph20DirectedGraphCycleDFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("number of nodes and edges");
        int[] ndEg = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // System.out.println(Arrays.toString(ndEg));
        int node = ndEg[0], edge = ndEg[1];

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i < node+1; i++) adjList.add(new ArrayList<>());

        System.out.println("Start entering the edges");
        for (int i = 0; i < edge; i++){
            ndEg = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjList.get(ndEg[0]).add(ndEg[1]);
        }

        System.out.println(cycleDirectedGraph(adjList));

        // System.out.println(adjList);
        sc.close();
    }


    static boolean cycleDirectedGraph(ArrayList<ArrayList<Integer>> adjList){
        boolean[] isVisited = new boolean[adjList.size()];
        boolean[] samePath = new boolean[adjList.size()];

        for (int i = 0; i < adjList.size(); i++){
            if (!isVisited[i]){
                boolean val = DFShelper(adjList, isVisited, samePath, i);
                if (val) return true;
            }
        }
        return false;
    }

    // false means no cycle
    static boolean DFShelper(ArrayList<ArrayList<Integer>> adjList, boolean[] isVisited, boolean[] samePath, int node){
        isVisited[node] = true;
        samePath[node] = true;

        if (adjList.get(node).size() == 0) return false;

        for (Integer connInt : adjList.get(node)){
            if (!isVisited[connInt]){
                if (DFShelper(adjList, isVisited, samePath, node) == true) return true;
            }
            else if (samePath[connInt]) return true;
        }

        samePath[node] = false; // most important step
        return false;

    }




    // static boolean cycleDirectedGraph(ArrayList<ArrayList<Integer>> adjList){
    //     boolean[] isVisited = new boolean[adjList.size()];
    //     for (int i = 0; i < isVisited.length; i++){
    //         if (!isVisited[i]){
    //             isVisited[i] = true;
    //             if (!DFShelper(adjList, isVisited, i)) return true;
    //         }
    //     }
    //     return false;

    // }

    // // false -> cycle DNE , true -> cycle Exists
    // static boolean DFShelper(ArrayList<ArrayList<Integer>> adjList, boolean[] isVisited, int node){
    //     ArrayList<Integer> connectedNodes = adjList.get(node);

    //     if (connectedNodes.size() == 0) return false;

    //     for (Integer connInt : connectedNodes){
    //         if (isVisited[connInt]) return true;
    //         else{
    //             isVisited[connInt] = true;
    //             boolean retVal = DFShelper(adjList, isVisited, connInt);
    //             if (retVal) return true;
    //         }
    //     }
    //     return false;
    // }
}
