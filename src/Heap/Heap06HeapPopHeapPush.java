package Heap;

public class Heap06HeapPopHeapPush {
    int[] heap;
    int size;
    public static void main(String[] args) {
        
    }

    static int heapPush(int[] arr, int size, int maxSize, int val){
        if (size == maxSize) return -1;

        arr[size] = val;
        size++;
        heapify(arr,size, size);
        return size;
    }

    static void heapify(int[] arr, int size, int index){
        // assuming min heap

        int p = (index-1)/2;

        if (arr[p] > arr[index]){
            int temp = arr[p];
            arr[p] = arr[index];
            arr[index] = temp;
            heapify(arr, size, p);
        }
    }

    static int heapPop(int[] heap, int size){
        if (size == 0) return Integer.MIN_VALUE;
        int pop = heap[0];
        heap[0] = heap[size - 1];
        size--;
        percolateDown(heap, 0, size);
        return pop;
    }

    static void percolateDown(int[] arr, int index, int size){
        int l = 2*index + 1;
        int r = 2*index + 2;
        int largest = index;

        if (arr[l] < size && arr[l] > arr[index]) largest = l;
        if (arr[r] < size && arr[r] > arr[largest]) largest = r;

        if (largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            percolateDown(arr, largest, size);
        }
    }

}
