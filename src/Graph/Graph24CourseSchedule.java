package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph24CourseSchedule {
    public static void main(String[] args) {
        
    }

    static int[] toposortPracKahn(List<List<Integer>> adjList){
        int[] ans = new int[adjList.size()];
        //create the inEdges array
        int[] inEdges = new int[adjList.size()];
        for (List<Integer> nodes : adjList){
            for (int node : nodes) inEdges[node]++; 
        }

        //Queue of 0 inEdges should be created
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inEdges.length; i++){
            if (inEdges[i] == 0) q.add(i);
        }

        //now iterate and subtract inEdges
        int index = 0;
        while (!q.isEmpty()){
            int currNode = q.poll();
            ans[index] = currNode;
            index++;
            for (int neighbours : adjList.get(currNode)){
                inEdges[neighbours]--;
                if (inEdges[neighbours] == 0) q.add(neighbours);
            }
        }
        return (index != adjList.size()) ? new int[]{-1} : ans;
        
    }
}
