package Heap;

public class Heap09KthLargestElement {
    
}
// https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int num : nums){
            if (maxHeap.size() < k) maxHeap.add(num);
            else if (maxHeap.peek() < num){
                maxHeap.poll();
                maxHeap.add(num);
            }
        }

        return maxHeap.peek();

    }
}
