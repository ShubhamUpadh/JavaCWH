package Heap;

class Heap01{
    public static void main(String[] args) {
        
    }

    static void maxHeapify(int[] heap, int i){
        // given an index i, heapify it
        int l = 2*i + 1;
        int r = 2*i + 1;
        int largest = i;

        if (l < heap.length && heap[l] > heap[i]){
            largest = l;
        }

        if (r < heap.length && heap[r] > heap[largest]){
            largest = r;
        }


        if (largest != i){
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            maxHeapify(heap, largest); // only largest is called because only that subtree is disturbed 
        }

    }

    static void minHeapify(int[] heap, int i){
        int l = 2*i + 1;
        int r = 2*i + 1;
        int smallest = i;

        if (l < heap.length && heap[l] < heap[i]) smallest = l;
        if (r < heap.length && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i){
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;
            minHeapify(heap, smallest); 
        }

    }

}

