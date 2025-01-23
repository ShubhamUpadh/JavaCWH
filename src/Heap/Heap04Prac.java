package Heap;

public class Heap04Prac {
    //1. heapify
    //2. extract min
    //3. increase key decrease key in min heap

    static void heapify(int[] heap, int i){
        //given min heap, heapify it
        if (i != 0 && heap[i] < heap[(i-1)/2]) heapifyUp(heap, i);
        else heapifyDown(heap,i);
    }

    static void heapifyUp(int[] heap, int i){
        int p = (i-1)/2;
        if(i == 0 || heap[p] < heap[i]) return;

        if(heap[p] > heap[i]){
            int temp = heap[p];
            heap[p] = heap[i];
            heap[i] = temp;
            heapifyUp(heap, p);
        }
    }

    static void heapifyDown(int[] heap, int i){
        int l = 2*i + 1;
        int r = 2*i + 2;
        int smallest = i;

        if (l < heap.length && heap[l] < heap[i]) smallest = l;
        if (r < heap.length && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i){
            int temp = heap[smallest];
            heap[smallest] = heap[i];
            heap[i] = temp;
            heapifyDown(heap, smallest);
        }
        
    }

    static void increaseKey(int[] heap, int newVal, int i){
        if (heap[i] > newVal) return;
        heap[i] = newVal;
        heapifyDown(heap, i);
    }

    static void decreaseKey(int[] heap, int i, int newVal){
        if (heap[i] < newVal) return;
        heap[i] = newVal;
        heapifyUp(heap, i);
    }

    static int extractMin(int[] heap){
        if (heap.length == 0) return Integer.MIN_VALUE;
        int min = heap[0];
        int heapSize = heap.length - 1;

        heapifyDown(heap, 0, heapSize);

        return min;
    }

    static void heapifyDown(int[] heap, int i, int heapSize){
        int l = 2*i + 1;
        int r = 2*i + 2;
        int smallest = i;

        if (l < heapSize && heap[l] < heap[i]) smallest = l;
        if (r < heapSize && heap[r] < heap[smallest]) smallest = r;
        
        if (smallest != i){
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            heapifyDown(heap, smallest, heapSize); 
        }
    }

}
