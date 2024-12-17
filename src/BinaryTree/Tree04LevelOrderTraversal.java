package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree04LevelOrderTraversal {
    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();
        LevelOrder(root);
    }

    public static void LevelOrder(Node root){
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        System.out.println();
        int level = 0;
        while (!nodeQueue.isEmpty()){
            System.out.println();
            System.out.println("Next level = #"+level++);
            //System.out.println("NodeQueue Size" + nodeQueue.size());
            int a = nodeQueue.size();
            for (int i = 0; i < a; i++){
                Node curr = nodeQueue.poll();
                System.out.print(curr.value +" ");
                if (curr.left != null) nodeQueue.add(curr.left);
                if (curr.right != null) nodeQueue.add(curr.right);
            }
        }
    }
}
