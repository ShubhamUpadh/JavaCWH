package BinaryTree;

import java.util.*;

public class Tree14TimeToBurn {

    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();
        treeUtility.LevelOrder(root);
        int val = 130;

        System.out.println(sol(root,val));
    }

    static int sol(Node root, int val){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        HashMap<Node, Node> map = new HashMap<>();
        Node valNode = new Node(-1);

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                Node currNode = q.poll();
                if (currNode.value == val)
                {
                    valNode = currNode;
                    System.out.println("Value found");
                }
                if (currNode.left != null){
                    map.put(currNode.left, currNode);
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    map.put(currNode.right, currNode);
                    q.add(currNode.right);
                }
            }
        }

        Set<Node> visitedNodes = new HashSet<>();
        Queue<Node> travellerQ = new LinkedList<>();

        travellerQ.add(valNode);
        int timeToBurn = 0;

        while (!travellerQ.isEmpty()){
            int size = travellerQ.size();

            for (int i = 0; i < size; i++){
                Node currNode = travellerQ.poll();

                if (currNode.left != null && !visitedNodes.contains(currNode.left)){
                    travellerQ.add(currNode.left);
                }
                if (currNode.right != null && !visitedNodes.contains(currNode.right)){
                    travellerQ.add(currNode.right);
                }
                if (map.containsKey(currNode) && !visitedNodes.contains(map.get(currNode))){
                    travellerQ.add(map.get(currNode));
                }
                visitedNodes.add(currNode);
            }
            timeToBurn++;
        }

        return timeToBurn;

    }
}
