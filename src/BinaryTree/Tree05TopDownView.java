package BinaryTree;

import java.util.*;



public class Tree05TopDownView {
    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root =  treeUtility.inputToTree();
        topDownView(root);
    }

    static void topDownView(Node root){
//        int pos = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        Pair basePair = new Pair(root, 0);

        queue.add(basePair);

        while (!queue.isEmpty()){

            Pair pair = queue.poll();

            Node curr = pair.node;
            int dist = pair.distance;

            if (!map.containsKey(dist)){
                map.put(dist, curr.value);
            }

            if (curr.left != null) queue.add(new Pair(curr.left, dist - 1));
            if (curr.right != null) queue.add(new Pair(curr.right, dist + 1));

        }

        for (Integer val : map.values()){
            System.out.print(val + " ");
        }





    }


}
