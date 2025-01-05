package org.DSA.Heaps;

import java.util.ArrayList;

public class HeapMinMaxTest {
    public static void main(String[] args) {
        // Create an array before heap operations (Original Array)
        ArrayList<Integer> originalArray = new ArrayList<>();
        originalArray.add(10);
        originalArray.add(20);
        originalArray.add(5);
        originalArray.add(30);
        originalArray.add(15);
        originalArray.add(25);
        // Display the original array
        System.out.println("Original Array: " + originalArray);

        // Now we can create a MinHeap or MaxHeap using this array
        // Test for MinHeap
        System.out.println("Testing MinHeap:");
        MinHeap minHeap = new MinHeap();

        // Insert elements into MinHeap
        for (int num : originalArray) {
            minHeap.insert(num);
        }

        // Display the MinHeap after insertion
        System.out.println("MinHeap after insertions:");
        minHeap.displayHeap();  // Expected: [5, 15, 10, 30, 20, 25]

        // Peek the minimum element in MinHeap
        System.out.println("Peek Min (MinHeap): " + minHeap.peekMin());  // Expected: 5

        // Extract the minimum element
        System.out.println("Extract Min (MinHeap): " + minHeap.extractMin());  // Expected: 5
        minHeap.displayHeap();  // Expected: [10, 15, 25, 30, 20]

        // Test emptying MinHeap
        while (!minHeap.isEmpty()) {
            System.out.println("Extract Min (MinHeap): " + minHeap.extractMin());
            minHeap.displayHeap();
        }
        System.out.println("MinHeap is empty: " + minHeap.isEmpty());  // Expected: true


        // Test for MaxHeap
        System.out.println("\nTesting MaxHeap:");
        MaxHeap maxHeap = new MaxHeap();

        // Insert elements into MaxHeap
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);
        maxHeap.insert(15);
        maxHeap.insert(25);

        // Display the MaxHeap after insertion
        System.out.println("MaxHeap after insertions:");
        maxHeap.displayHeap();  // Expected: [30, 20, 25, 10, 15, 5]

        // Peek the maximum element in MaxHeap
        System.out.println("Peek Max (MaxHeap): " + maxHeap.peekMax());  // Expected: 30

        // Extract the maximum element
        System.out.println("Extract Max (MaxHeap): " + maxHeap.extractMax());  // Expected: 30
        maxHeap.displayHeap();  // Expected: [25, 20, 5, 10, 15]

        // Test emptying MaxHeap
        while (!maxHeap.isEmpty()) {
            System.out.println("Extract Max (MaxHeap): " + maxHeap.extractMax());
            maxHeap.displayHeap();
        }
        System.out.println("MaxHeap is empty: " + maxHeap.isEmpty());  // Expected: true
    }
}
