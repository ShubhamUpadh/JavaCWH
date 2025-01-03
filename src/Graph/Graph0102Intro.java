package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class Graph0102Intro {
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
                System.out.print(" | " + adjacentcyMatrix[j][k] + " | ");
            }
            System.out.println();
        }
        

    }
}
