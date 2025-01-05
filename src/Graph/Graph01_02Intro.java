package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Pair{
    int node;
    int weight;
    public Pair(int node, int weight){
        this.node = node;
        this.weight = weight;
    }
}

public class Graph01_02Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes and no of edges -> n and m");
        String n_m = sc.nextLine();
        String[] nodeEdges = n_m.split(" ");
        int nodes = 0, edges = 0;
        try{
        nodes = Integer.parseInt(nodeEdges[0]);
        edges = Integer.parseInt(nodeEdges[1]);
        System.out.println(nodes + " | " + edges);
        }
        catch (NumberFormatException e){
            System.out.println(e);
            return;
        }

        int[][] adjacentcyMatrix = new int[nodes+1][nodes+1];
        
        for (int i = 0; i < edges; i++){
            System.out.print("Enter the edges -> ");
            String edge = sc.nextLine();
            int[] edgePair = Arrays.stream(edge.split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacentcyMatrix[edgePair[0]][edgePair[1]] = 1;
            adjacentcyMatrix[edgePair[1]][edgePair[0]] = 1;
        }

        for (int j = 0; j < nodes + 1; j++){
            for (int k = 0; k < nodes + 1; k++){
                System.out.print("| " + adjacentcyMatrix[j][k] + " | ");
            }
            System.out.println();
        }
        
        ArrayList<ArrayList<Integer>> adjacentcyList = new ArrayList<>();

        for (int i = 0; i < edges; i++) adjacentcyList.add(new ArrayList<>());

        System.out.println("Enter the list of edges ");
        for (int i = 0; i < edges; i++){
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacentcyList.get(numbers[0]).add(numbers[1]);
            adjacentcyList.get(numbers[1]).add(numbers[0]);
        }

        System.out.println(adjacentcyList);

        int[][] adjacentcyMatrix2 = new int[nodes+1][nodes+1];
        
        for (int i = 0; i < edges; i++){
            System.out.print("Enter the edges -> ");
            String edge = sc.nextLine();
            int[] edgePair = Arrays.stream(edge.split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacentcyMatrix2[edgePair[0]][edgePair[1]] = edgePair[2];
            adjacentcyMatrix2[edgePair[1]][edgePair[0]] = edgePair[2];
        }

        for (int j = 0; j < nodes + 1; j++){
            for (int k = 0; k < nodes + 1; k++){
                System.out.print("| " + adjacentcyMatrix2[j][k] + " | ");
            }
            System.out.println();
        }
        
        ArrayList<ArrayList<Pair>> adjacentcyList2 = new ArrayList<>();

        for (int i = 0; i < edges; i++) adjacentcyList2.add(new ArrayList<Pair>());

        System.out.println("Enter the list of edges ");
        for (int i = 0; i < edges; i++){
            int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacentcyList2.get(numbers[0]).add(new Pair(numbers[1], numbers[2]));
            adjacentcyList2.get(numbers[1]).add(new Pair(numbers[0], numbers[2]));
        }

        System.out.println(adjacentcyList2);

    }
}
