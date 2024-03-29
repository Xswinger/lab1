package com.xswinger.part2;

public class HeapSort {

    public int[] sort(int[] arr) {
        int heapSize = arr.length;

        for (int i = heapSize/2-1; i >= 0; i--) {
            buildHeap(arr, heapSize, i);
        }

        for (int i = heapSize - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            buildHeap(arr, i, 0);
        }

        return arr;
    } 

    public int[] buildHeap(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            buildHeap(arr, heapSize, largest);
        }


        return arr;
    }
}
