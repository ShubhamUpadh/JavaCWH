package BinaryTree;

public class Tree06CheckIfBST {
    public static void main(String[] args) {
        int leftVal = Integer.MIN_VALUE;
        int rightVal = Integer.MAX_VALUE;

        TreeUtility treeUtility = new TreeUtility();

        Node root = treeUtility.inputToTree();

        //root.right = new Node(100);


        System.out.println(checkIfBST(root, leftVal, rightVal));


    }

    static boolean checkIfBST(Node root, int leftVal, int rightVal){
        if (root == null) return true;

        if (root.left != null && root.left.value > root.value) return false;
        if (root.right != null && root.right.value < root.value) return false;

        if (root.value < leftVal || root.value > rightVal) return false;

        return checkIfBST(root.left, leftVal, root.value) && checkIfBST(root.right,root.value, rightVal);

    }

}
