package BinaryTree;

import java.util.Arrays;
import java.util.Scanner;

public class Tree02traversals {

    public static void main(String[] args) {
        Node root = inputToTree();

        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);

    }



    public static Node inputToTree() {
        String ip;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the values -> space seperated, any non integeral value leads to termination");
        ip = sc.nextLine();

        String[] ipSplit = ip.split(" ");
        int[] values = Arrays.stream(ipSplit).
                filter(s -> s.matches("-?\\d+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Node root = null;

        for (int val : values){
            if (root == null){
                root = insertNode(val, root);
            }
            else {
                insertNode(val, root);
            }
        }

        //System.out.println(root);
        return root;
    }

    public static Node createNode(int value){
        return new Node(value);
    }

    public static Node insertNode(int value,Node root){
        if (root == null){
            return new Node(value);
        }
        if (root.value > value){
            root.left =  insertNode(value, root.left);
        }
        else{
            root.right = insertNode(value, root.right);
        }
        return root;
    }

    public static void inOrderTraversal(Node root){
        if (root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        if (root == null) return;

        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if (root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

}
