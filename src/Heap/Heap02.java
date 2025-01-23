package Heap;

class Heap02{
    public static void main(String[] args) {
        
    }

    static int extractMax(int[] heap, int size){
        int max = heap[0];
        
        heap[0] = heap[size-1];
        size = size - 1;

        maxHeapify(heap, size, 0);

        return max; 

    }

    static void maxHeapify(int[] arr, int size, int i){
        int l = i*2 + 1;
        int r = i*2 + 2;
        int largest = i;

        if (l < size && arr[l] > arr[i]) largest = l;
        if (r < size && arr[r] > arr[largest]) largest = r;

        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr, size, largest);
        }
    }
}