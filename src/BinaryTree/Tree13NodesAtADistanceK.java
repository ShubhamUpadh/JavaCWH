package BinaryTree;

import java.util.*;

public class Tree13NodesAtADistanceK {
    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();
    }

    static Node sol(Node root, int val,int distance){
        HashMap<Node, Node> map = new HashMap<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node searchNode;

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                Node currNode = q.poll();
                if (currNode.value == val){
                    searchNode = currNode;
                }
                if (currNode.left != null){
                    q.add(currNode.left);
                    map.put(currNode.left,currNode);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                    map.put(currNode.right,currNode);
                }
            }

        }

        Set<Node> set = new HashSet<>();

        printUp(searchNode, map, distance, set);

        printDown(searchNode, distance);
    }

    static void printUp(Node searchNode, HashMap<Node,Node> map, int distance, Set<Node> set){

        if (searchNode == null || set.contains(searchNode)) return;

        Node parentNode = map.get(searchNode);

        if (distance == 0){
            System.out.println(parentNode.value);
            return;
        }

        set.add(searchNode);

        printUp(parentNode, map, distance - 1, set);

        if (parentNode.left != null && !set.contains(parentNode.left)){
            printUp(parentNode.left, map, distance -1, set);
        }
        if (parentNode.right != null && !set.contains(parentNode.right)){
            printUp(parentNode.right, map, distance -1, set);
        }

    }

    static void printDown(Node root, int distance){
        if (root == null) return;

        if (distance == 0){
            System.out.println(root.value);
            return;
        }
        printDown(root.left,distance-1);
        printDown(root.right,distance-1);

    }

    static void solution(Node root, int distance, int value){

        Queue<Node> q = new LinkedList<>();
        HashMap<Node, Node> map = new HashMap<>();
        q.add(root);
        Node valNode;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                Node currNode = q.poll();
                if (currNode.value == value) valNode = currNode;
                if(currNode.left != null){
                    q.add(currNode.left);
                    map.put(currNode.left, currNode);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                    map.put(currNode.right, currNode);
                }
            }
        }

        Set<Node> visitedNodes = new HashSet<>();
        Queue<Node> travellerQ = new LinkedList<>();
        travellerQ.add(valNode);
        int travelled = 0;

        while (travelled <= distance){
            int size = travellerQ.size();
            for (int i = 0; i < size; i++){
                Node currNode = travellerQ.poll();
                Node parentNode = map.get(currNode);
                visitedNodes.add(currNode);
                if (currNode.left != null && !visitedNodes.contains(currNode.left)){
                    travellerQ.add(currNode.left);
                }
                if (currNode.right != null && !visitedNodes.contains(currNode.right)){
                    travellerQ.add(currNode.left);
                }
                if (!visitedNodes.contains(parentNode)){
                    travellerQ.add(parentNode);
                }
            }
            travelled++;
        }

        for (Node node : travellerQ){
            System.out.print(node.value + " ");
        }


    }

}
