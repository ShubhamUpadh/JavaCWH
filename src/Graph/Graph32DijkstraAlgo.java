package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    int node;
    int dist;
    public Pair(int node, int dist){
        this.node = node;
        this.dist = dist;
    }
    @Override
    public String toString(){
        return " node = " + node + " distance = " + dist;
    }
} 

public class Graph32DijkstraAlgo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>(6);
        for (int i = 0; i <6; i++) adjList.add(new ArrayList<>());
        
        adjList.get(0).add(new Pair(1, 2));
        adjList.get(0).add(new Pair(2, 4));
        adjList.get(1).add(new Pair(2, 2));
        adjList.get(1).add(new Pair(0, 4));
        adjList.get(2).add(new Pair(3, 3));
        adjList.get(2).add(new Pair(4, 1));
        adjList.get(2).add(new Pair(5, 6));
        adjList.get(3).add(new Pair(2, 3));
        adjList.get(3).add(new Pair(5, 2));
        adjList.get(4).add(new Pair(2, 1));
        adjList.get(4).add(new Pair(5, 3));
        adjList.get(5).add(new Pair(2, 6));
        adjList.get(5).add(new Pair(3, 2));
        adjList.get(5).add(new Pair(4, 3));

        System.out.println(adjList);

        for (ArrayList<Pair> l : adjList){
            for (Pair p : l) System.out.print(p.toString() + " \t");
            System.out.println();
        }

        
    }

    static int[] DijkstraAlgo(ArrayList<ArrayList<Pair>> adjList, int source){
        int[] distance = new int[adjList.size()];

        for (int i = 0; i < distance.length; i++) distance[i] = Integer.MAX_VALUE;

        Comparator<Integer> newComp = (a,b) -> Integer.compare(distance[a], distance[b]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(newComp);

        distance[source] = 0;
        minHeap.add(source);

        while (!minHeap.isEmpty()){
            int currDist = distance[minHeap.peek()];
            ArrayList<Pair> neighbourNodes = adjList.get(minHeap.poll());

            for (Pair p : neighbourNodes){
                int pNode = p.node;
                int pDist = p.dist;

                if (distance[pNode] == Integer.MAX_VALUE){
                    distance[pNode] = currDist + pDist;
                    minHeap.add(pNode);
                }
                else if (distance[pNode] > currDist + pDist){
                    distance[pNode] = currDist + pDist;
                    minHeap.add(pNode);
                }
            }
        }
        return distance;

    }
    
}
