package org.DSA.Heaps;

public class MinPriorityQueue {
    private final MinHeap minHeap;

    public MinPriorityQueue() {
        minHeap = new MinHeap();
    }

    public void insert(int value) { // Insert an element into the priority queue (heap)
        minHeap.insert(value);
    }

    public int extract() {  // Extract the element with the highest priority (smallest element)
        return minHeap.extractMin(); // Using extractMin from MinHeap
    }

    public int peek() {   // Peek at the element with the highest priority (smallest element)
        return minHeap.peekMin(); // Using peekMin from MinHeap
    }

    public void displayQueue() {   // Display the current heap (priority queue)
        minHeap.displayHeap();
    }

    public boolean isEmpty() {  // Check if the queue is empty
        return minHeap.isEmpty();
    }
}
