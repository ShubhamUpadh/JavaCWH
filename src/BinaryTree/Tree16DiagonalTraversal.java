package BinaryTree;

import java.util.*;

class TripletNodeDepthDistance{
    Node node;
    int depth;
    int distance;
    public TripletNodeDepthDistance(Node node, int depth, int distance){
        this.node = node;
        this.depth = depth;
        this.distance = distance;
    }
}

class PairDD{
    int depth;
    int distance;
    public PairDD(int depth, int distance){
        this.depth = depth;
        this.distance = distance;
    }
}

//public class Tree16DiagonalTraversal {
//    static void sol(Node root){
//        Queue<TripletNodeDepthDistance> q = new LinkedList<>();
//        HashMap<PairDD, ArrayList<Node>> map = new HashMap<>();
//
//        q.add(new TripletNodeDepthDistance(root,0,0));
//        int maxSize = 0;
//        while (!q.isEmpty()){
//            int size = q.size();
//            for (int i = 0; i < size; i++){
//                TripletNodeDepthDistance currTrip = q.poll();
//                PairDD newPair = new PairDD(currTrip.depth, currTrip.distance);
//                //maxSize = Math.max(maxSize, currTrip.depth + )
//                if (map.containsKey(newPair)){
//                    ArrayList<Node> existing = map.get(newPair);
//                    existing.add(currTrip.node);
//                    map.put(newPair, existing);
//                }
//                else{
//                    map.put(newPair, new ArrayList<>(Arrays.asList(currTrip.node)));
//                }
//                Node nd = currTrip.node;
//                if (nd.left != null){
//
//                    q.add(new TripletNodeDepthDistance(nd.left, currTrip.depth + 1, currTrip.distance - 1));
//                }
//                if (nd.right != null){
//
//                    q.add(new TripletNodeDepthDistance(nd.right, currTrip.depth + 1, currTrip.distance + 1));
//                }
//
//            }
//        }
//
//        TreeMap<Integer,ArrayList<Integer>> diagonalMap = new TreeMap<>();
//        for (Map.Entry<PairDD, ArrayList<Node>> e : map.entrySet()){
//            PairDD keyPair =  e.getKey();
//            ArrayList<Node> arr = e.getValue();
//            ArrayList<Integer> vals = new ArrayList<>();
//
//            for (int i = 0; i < arr.size(); i++){
//                vals.add(arr.get(i).value);
//            }
//
//
//            if (diagonalMap.containsKey(keyPair.depth - keyPair.distance)){
//                ArrayList<Integer> existingList = diagonalMap.get(keyPair.depth - keyPair.distance);
//                //existingList.add(vals);
//                diagonalMap.put(keyPair.depth - keyPair.distance, existingList);
//            }
//            else{
//                diagonalMap.put(keyPair.depth - keyPair.distance, vals);
//            }
//
//        }
//
//    }
//
//    static void betterSol(Node root){
//        Queue<Pair> q = new LinkedList<>();
//        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
//
//        //q.add(new Pair(q, 0));
//
//        while (!q.isEmpty()){
//            int size = q.size();
//            for (int i = 0; i < size; i++){
//                Pair currPair = q.poll();
//                Node currNode = currPair.node;
//                if (currNode.left != null){
//                    q.add(new Pair(currNode.left, currPair.distance-1));
//                }
//                if (currNode.right != null){
//                    q.add(new Pair(currNode.right, currPair.distance));
//                }
//                if (map.containsKey(currPair.distance)){
//                    ArrayList<Integer> arr = map.get(currPair.distance);
//                    arr.add(currNode.value);
//                    map.put(currPair.distance, arr);
//                }
//                else map.put(currPair.distance, new ArrayList<>(Arrays.asList(currNode.val)));
//            }
//        }
//
//
//    }
//}
