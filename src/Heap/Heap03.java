package Heap;

public class Heap03 {
    public static void main(String[] args) {
        
    }

    static boolean increaseKey(int[] heap, int index, int newVal){
        // implement this for a max heap
        if (index > heap.length) return false;
        heap[index] = newVal;
        percolateUp(heap, index);
        return true;
    }

    static void percolateUp(int[] heap, int index){
        if (index == 0 || heap[index/2] > heap[index]) return;
        else{
            int temp = heap[index/2];
            heap[index/2] = heap[index];
            heap[index] = temp;
            percolateUp(heap, index/2);
        }
    }

    static boolean decreaseKey(int[] heap, int index, int newVal){
        heap[index] = newVal;
        maxHeapify(heap, index);
        return true;
    }

    static void maxHeapify(int[] heap,int index){
        
    }

    static void insertKey(int[] heap, int size, int key){
        heap[size] = key;
        size++;
        percolateUpK(heap, size - 1);
    }

    static void percolateUpK(int[] heap, int i){
        int p = i/2;
        if (heap[p] > heap[i]) return;

        int temp = heap[p];
        heap[p] = heap[i];
        heap[i] = temp;
        percolateUp(heap, p);
    }
}
