// https://leetcode.com/problems/task-scheduler/description/
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] frequencies = new int[26];

        for (char task : tasks) frequencies[(int)task - (int)'A']++;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int freq : frequencies){
            if (freq > 0) maxHeap.add(freq);
        }

        int intervals = 0;

        while (!maxHeap.isEmpty()){

            ArrayList<Integer> currTasks = new ArrayList<>();
            int tasksInCycle = 0;
            //we will take out n tasks of the heap which will ensure that we are able to subtract the frequencies correctly
            for (int i = 0; i < n + 1; i++){
                if (!maxHeap.isEmpty()){
                currTasks.add(maxHeap.poll());
                tasksInCycle++;
                }
            }

            for (int freq : currTasks){
                if (freq > 1) maxHeap.add(freq-1);
            }

            intervals += maxHeap.isEmpty() ? tasksInCycle : n + 1;
        }
        return intervals;

    }
}