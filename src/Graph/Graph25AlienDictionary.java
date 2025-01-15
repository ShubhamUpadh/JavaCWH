package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph25AlienDictionary {
    public static void main(String[] args) {
        String[] words = new String[]{"abc","cab","cba"};
        System.out.println(alienDictionary(words, words.length));
    }

    static char[] wordOrder(String s1, String s2){
        
        // char[] ans = new char[2];

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return new char[]{s1.charAt(i), s2.charAt(i)};
            }
        }
        return new char['a'];

    }

    static List<Character> alienDictionary(String[] words, int n){
        
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) adjList.add(new ArrayList<>());

        for (int i = 0; i < words.length - 1; i++){
            char[] order = wordOrder(words[i], words[i+1]);
            adjList.get((int)order[0] - (int)'a').add((int)order[1] - (int)'a');
        }

        ArrayList<Integer> topoSortList = topoSort(adjList);

        return topoSortList.stream().map(value -> (char)(value + (int)'a')).toList();

    }

    static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adjList){
        
        Queue<Integer> q = new LinkedList<>();
        int[] inedges = new int[adjList.size()];

        for (ArrayList<Integer> neighbours : adjList){
            for (int node : neighbours) inedges[node]++;
        }

        for (int i = 0; i < inedges.length; i++){
            if (inedges[i] == 0) q.add(i);
        }

        ArrayList<Integer> res = new ArrayList<>();

        while (!q.isEmpty()){
            int currNode = q.poll();
            res.add(currNode);
            for (int node : adjList.get(currNode)){
                inedges[node]--;
                if (inedges[node] == 0) q.add(node);
            }
        }

        return res;

    }
}
