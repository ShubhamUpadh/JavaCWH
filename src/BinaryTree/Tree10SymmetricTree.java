package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Tree10SymmetricTree {

    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = new Node(1);
        Node root1 = new Node(2);
        Node root2 = new Node(2);

        root.right = root1;
        root.left = root2;

        Node toor = new Node(3);
        toor.right = root1;
        toor.left = root;



        System.out.println(sol(root));
        System.out.println(sol(toor));

    }

    static boolean isNotPalindrome(ArrayList<Integer> list){
        for (int i = 0; i <(list.size() / 2) ; i++){
            if (!Objects.equals(list.get(i), list.get(list.size() - 1 - i))){
                return true;
            }
        }
        return false;
    }

    static boolean sol(Node root){
        //ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();


            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++){
                Node currNode = q.poll();

                list.add(currNode.value);

                if (currNode.left != null) q.add(currNode.left);
                if (currNode.right != null) q.add(currNode.right);
            }

            if (isNotPalindrome(list)) return false;

        }
        return true;

    }
}
