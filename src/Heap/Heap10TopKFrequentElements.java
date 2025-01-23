package Heap;

// https://leetcode.com/problems/top-k-frequent-elements/submissions/1516020909/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            if (!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }

        System.out.println(map);
        Comparator newComp = (a,b) -> (map.get(a) - map.get(b));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(newComp);
        int currSize = 0;

        for (int key : map.keySet()){
            System.out.println(key + " " + minHeap);
            if (currSize < k) {
                minHeap.add(key);
                currSize++;
            }
            else if (map.get(key) > map.get(minHeap.peek())){
                minHeap.poll();
                minHeap.add(key);
            }
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++) res[i] = minHeap.poll();

        return res;
    }
}