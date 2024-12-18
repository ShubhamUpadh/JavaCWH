package BinaryTree;

import java.util.*;

public class Tree15LCA {

    public static void main(String[] args) {

        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();
        Node p = new Node(10);
        Node q = new Node(100);
        root = addPtoBT(root,p);
        root = addQtoBT(root,q);
        treeUtility.LevelOrder(root);
        System.out.println(sol(root,p,q).value);
    }

    static Node solRecursive(Node root, Node p, Node q){
        if (root == null || root == p || root == q){
            return root;
        }

        Node leftRet = solRecursive(root.left, p, q);
        Node rightRet = solRecursive(root.right, p, q);

        if (leftRet != null && rightRet != null) return root;

        return (leftRet == null) ? rightRet : leftRet;

    }

    static Node addPtoBT(Node root,Node p){
        Node dummy = root;
        while (root.left != null){
            root = root.left;
        }
        root.left = p;
        return dummy;
    }


    static Node addQtoBT(Node root,Node q){
        Node dummy = root;
        while (root.right != null){
            root = root.right;
        }
        root.right = q;
        return dummy;
    }

    static Node sol(Node root, Node p, Node qn){
        Queue<Node> q = new LinkedList<>();
        HashMap<Node,Node> childParent = new HashMap<>();

        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++){
                Node currNode = q.poll();
                if (currNode.left != null){
                    q.add(currNode.left);
                    childParent.put(currNode.left,currNode);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                    childParent.put(currNode.right, currNode);
                }
            }
        }

        for (Map.Entry<Node, Node> e : childParent.entrySet()){
            System.out.println("Child = " + e.getKey().value + " | Parent = " + e.getValue().value);
        }

        ArrayList<Node> pToRoot = new ArrayList<>();
        Node currNode = p;

        while (childParent.containsKey(currNode)){
            pToRoot.add(currNode);
            currNode = childParent.get(currNode);
        }

        pToRoot.add(currNode);

        System.out.print("Printing arraylist \n");

        for (Node node : pToRoot){
            System.out.print(node.value + " ");
        }

        currNode = qn;

        while (childParent.containsKey(currNode)){
            if (pToRoot.contains(currNode)){
                System.out.println("Found");
                return currNode;
            }
            currNode = childParent.get(currNode);
        }
        if (pToRoot.contains(currNode)){
            System.out.println("FOund");
            return currNode;
        }


        return new Node(-1);


    }

}
