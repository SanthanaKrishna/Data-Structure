package org.DSA.Heaps;

public class MaxPriorityQueue {
    private final MaxHeap maxHeap; // Using MaxHeap as the underlying data structure

    public MaxPriorityQueue() {
        maxHeap = new MaxHeap();
    }

    // Insert an element into the priority queue (heap)
    public void insert(int value) {
        maxHeap.insert(value);
    }

    // Extract the element with the highest priority (largest element)
    public int extract() {
        return maxHeap.extractMax(); // Using extractMax from MaxHeap
    }

    // Peek at the element with the highest priority (largest element)
    public int peek() {
        return maxHeap.peekMax(); // Using peekMax from MaxHeap
    }

    // Display the current heap (priority queue)
    public void displayQueue() {
        maxHeap.displayHeap();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }
}
