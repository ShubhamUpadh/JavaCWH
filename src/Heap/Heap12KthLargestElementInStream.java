package Heap;

public class Heap12KthLargestElementInStream {
    
}

// https://leetcode.com/problems/kth-largest-element-in-a-stream/


class KthLargest {

    int[] pq; // minheap of size k
    int k;
    int index = 0;

    public KthLargest(int k, int[] nums) {
        this.pq = new int[k];
        this. k = k;
        // Arrays.sort
        // for (int i = 0; i < k; i++) pq[i] = Integer.MAX_VALUE;
        for (int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        // System.out.println("adding " + val);
        if (index < k) {
            pq[index] = val;
            heapifyUp(index);
            index++;
        }
        else if (pq[0] < val){
            pq[0] = val;
            heapifyDown(0);
        }
        // System.out.println("@ add " + Arrays.toString(pq));
        return pq[0];   
    }

    // private void heapify(int i){
    //     heapifyUp(i);
    //     heapifyDown(i);
    // }

    private void heapifyUp(int i){
        // System.out.println("@heapifyUp " + i + Arrays.toString(pq));
        int p = (i-1)/2;
        if(i == 0 || pq[p] < pq[i]) return;
        int temp = pq[i];
        pq[i] = pq[p];
        pq[p] = temp;
        heapifyUp(p);
    }

    private void heapifyDown(int i){
        // System.out.println("@heapifyDown " + i + Arrays.toString(pq));

        int l = i*2 + 1;
        int r = i*2 + 2;
        int smallest = i;

        if (l < k && pq[l] < pq[i]) smallest = l;
        if (r < k && pq[r] < pq[smallest]) smallest = r;

        if (smallest != i){
            int temp = pq[smallest];
            pq[smallest] = pq[i];
            pq[i] = temp;
            heapifyDown(smallest);
        }

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

