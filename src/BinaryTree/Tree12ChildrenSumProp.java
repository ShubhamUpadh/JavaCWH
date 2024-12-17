package BinaryTree;

public class Tree12ChildrenSumProp {
    public static void main(String[] args) {
        TreeUtility treeUtility = new TreeUtility();
        Node root =  treeUtility.inputToTree();
        int a = Integer.MIN_VALUE;
        System.out.println(Integer.MIN_VALUE == a);

        treeUtility.LevelOrder(root);


        Node newRoot = CSP(root);

        treeUtility.LevelOrder(newRoot);


//        treeUtility.

    }

    static Node CSP(Node root){
        int val = CSPhelper(root);
        return root;
    }

    static int CSPhelper(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }

        int leftRet = CSPhelper(root.left);
        int rightRet = CSPhelper(root.right);

        int childSum = 0;

        if (leftRet == rightRet && leftRet == Integer.MIN_VALUE) return root.value;

        if (leftRet != Integer.MIN_VALUE) childSum += leftRet;
        if (rightRet != Integer.MIN_VALUE) childSum += rightRet;

        root.value = childSum;
        return root.value;
    }

}
