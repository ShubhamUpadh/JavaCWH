package BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Tree09LeftView {

    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();
        sol(root);
    }

    static void sol(Node root){
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                Pair currPair = q.poll();
                Node currNode = currPair.node;
                int currDistance = currPair.distance;

                //System.out.println(currNode.value);

                if (!map.containsKey(currDistance)){
                    map.put(currDistance,currNode.value);
                }

                if (currNode.left != null) q.add(new Pair(currNode.left, currDistance + 1));
                if (currNode.right != null) q.add(new Pair(currNode.right, currDistance + 1));
            }

        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
