package BinaryTree;

import java.util.*;

public class Tree08BottomView {

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
            int sz = q.size();

            for (int i = 0; i < q.size(); i++){
                Pair currPair = q.poll();
                Node currNode = currPair.node;
                int currLoc = currPair.distance;

                map.put(currLoc, currNode.value);

                if (currNode.left != null) q.add(new Pair(currNode.left, currLoc -1));
                if (currNode.right != null) q.add(new Pair(currNode.right, currLoc + 1));

            }
        }

        for (Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.print(e.getValue() + " ");
        }

    }

}
