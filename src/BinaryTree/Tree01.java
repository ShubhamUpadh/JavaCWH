package BinaryTree;

import java.util.Arrays;
import java.util.Scanner;

public class Tree01 {

    public Node inputToTree(String[] args) {
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

        System.out.println(root);
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
}
