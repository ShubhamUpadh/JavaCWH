package Heap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Heap05HeapSort {
    public static void main(String[] args) {
        // int[] arr = new int[]{5,10,15,7};
        // System.out.println(Arrays.toString(arr));
        // heapSort(arr);
        // System.out.println(Arrays.toString(arr));
        hpsrt();
    }

    static void heapSort(int[] arr){
        int n = arr.length;
        //1. build  a max heap
        //1.1 start -> n/2 - 1 to 0, heapify up
        for(int i = (n/2)-1; i > -1 ; i--){
            heapify(arr,i,arr.length-1);
        }
        // System.out.println("After heapifying -> " + Arrays.toString(arr));

        //2. start taking out the first element and replace with the lat heap element 
        // and then heapify small heap again

        for (int i = arr.length - 1; i > -1; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i-1);
            System.out.println("After iteration #" + i + " -> " + Arrays.toString(arr));
        }
    }

    static void heapify(int[] arr, int i, int size){
        int l = 2*i + 1;
        int r = 2*i + 2;

        int largest = i;

        if (l <= size && arr[l] > arr[largest]) largest = l;
        if (r <= size && arr[r] > arr[largest]) largest = r;

        if (largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, largest, size);
        }
    }

    static void hpsrt(){
        int[] arr = new int[]{10,12,34,55,65,1,43,182,12};
        System.out.println(Arrays.toString(arr));
        heapSort2(arr,arr.length);
        System.out.println(Arrays.toString(arr));

        // now start popping the first element and store it in the same array
        for (int i = arr.length - 1; i > -1; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSort2(arr, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void heapSort2(int[] arr, int size){
        //make a heap -> heapify the array and buildHeap
        buildHeap(arr, size);
        // System.out.println(Arrays.toString(arr));

    }

    static void heapify2(int[] arr, int i, int size){
        int l = 2*i + 1;
        int r = 2*i + 2;
        int smallest = i;

        if (l < size && arr[l] < arr[smallest]) smallest = l;
        if (r < size && arr[r] < arr[smallest]) smallest = r;

        if (smallest != i){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            heapify2(arr, smallest, size);
        }
    }

    static void buildHeap(int[] arr, int size){
        for (int i = (arr.length)/2 -1; i > -1; i--){
            heapify2(arr, i, size);
        }
    }
}
