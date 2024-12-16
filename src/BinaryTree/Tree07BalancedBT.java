package BinaryTree;

public class Tree07BalancedBT {
    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root = treeUtility.inputToTree();

        System.out.println(isBalancedBT(root));

    }

    static int isBalancedBT(Node root){
        if (root == null){
            return 0;
        }

        int leftHeight = isBalancedBT(root.left);
        int rightHeight = isBalancedBT(root.right);

        if (leftHeight < 0 || rightHeight < 0 || Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        else{
            return 1+ Math.max(leftHeight, rightHeight);
        }


    }
}
