package BinaryTree;

public class Node{
    public int value;
    public Node left = null;
    public Node right = null;

    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        System.out.println(this.value);
        System.out.println("val = " + this.value +
                " | left = " + this.left +
                " | right = " + this.right);
        return "";
    }
}

