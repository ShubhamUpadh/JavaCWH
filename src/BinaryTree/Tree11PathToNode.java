package BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

class ListPair{
    boolean aBoolean;
    ArrayList<Integer> list;

    ListPair(boolean aBoolean, ArrayList<Integer> list){
        this.aBoolean = aBoolean;
        this.list = list;
    }
}

public class Tree11PathToNode {



    static ListPair sol(Node root, Node prov, ArrayList<Integer> list){
        if (root == null) return new ListPair(false, (ArrayList<Integer>) Arrays.asList(new Integer[]{5}));

        if (root == prov) return new ListPair(true, new ArrayList<>(root.value) );

        ListPair left = sol(root.left, prov, list);
        ListPair right = sol(root.right, prov, list);

        if(left.aBoolean){
            ArrayList<Integer> prevList = left.list;
            prevList.add(root.value);
            return new ListPair(true, prevList);
        }

        if(right.aBoolean){
            ArrayList<Integer> prevList = right.list;
            prevList.add(root.value);
            return new ListPair(true, prevList);
        }

        return new ListPair(false, new ArrayList<>(){});


    }
}
