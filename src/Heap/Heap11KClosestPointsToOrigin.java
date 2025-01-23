package Heap;

public class Heap11KClosestPointsToOrigin {
    
}
class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Double originDist(){
        return Math.sqrt(x*x + y*y);
    }
}
class Solution {

    
    public int[][] kClosest(int[][] points, int k) {
        Comparator<Pair> distOrigin = (a,b) -> Double.compare(b.originDist(), a.originDist());
        PriorityQueue<Pair> kcp = new PriorityQueue<>(distOrigin);
    
        for (int[] point : points){
            Pair newPt = new Pair(point[0], point[1]);
            kcp.add(newPt);
            if (kcp.size() > k) kcp.poll();
        }

        int[][] res = new int[k][2];

        for (int i = 0; i < k; i++){
            Pair p = kcp.poll();
            res[i][0] = p.x;
            res[i][1] = p.y;
        }

        return res;




    }
}