package org.DSA.Sorting;

public class HeapSort {
    public void heapSort(int arr[]) { // Main function to perform heap sort
        int n = arr.length;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // One by one extract elements from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end (swap arr[0] with arr[i])
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);  // Call heapify on the reduced heap
        }
    }

    void heapify(int arr[], int n, int i) { // Function to maintain heap property
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        if (left < n && arr[left] > arr[largest]) { // If left child is larger than root
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {  // If right child is larger than largest so far
            largest = right;
        }

        if (largest != i) { // If largest is not root
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest); // Recursively heapify the affected sub-tree
        }
    }

    // A utility function to print an array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSort ob = new HeapSort();
        ob.heapSort(arr);

        System.out.println("Sorted array is:");
        printArray(arr);
    }
}
