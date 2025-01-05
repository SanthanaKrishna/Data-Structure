package org.DSA.Heaps;

import java.util.ArrayList;

/**
 * A PriorityQueue is a data structure that works like a regular queue, but with a twist: instead of processing elements in the order they are inserted (FIFO: First In, First Out), elements are processed based on their priority.
 * The element with the highest priority is processed first. In a min-priority queue, the element with the smallest value has the highest priority, while in a max-priority queue, the element with the largest value has the highest priority.
 *
 * In Java, the PriorityQueue class is a part of the java.util package and implements a min-heap by default.
 * However, you can modify the behavior to implement a max-heap by providing a custom comparator.
 */
public class PriorityQueue {
    private ArrayList<Integer> heap;

    // Constructor: Initializes the Priority Queue
    public PriorityQueue(){
        heap= new ArrayList<>();
    }

    // Returns the top element (minimum) in the heap
    public int peek(){
        if(heap.isEmpty()){
            throw new IllegalStateException("Priority Queue is empty");
        }
        return heap.get(0);
    }

    private int parentIndex(int index) { // Get the index of the parent of a node
        return (index - 1) / 2;
    }

    private int letChildIndex(int index) { // Get the index of the left child of a node
        return 2 * index + 1;
    }

    private int rightChildIndex(int index) { // Get the index of the right child of a node
        return 2 * index + 2;
    }

    // Inserts a new element into the Priority Queue
    public void insert(int value){
        heap.add(value);// Add the new element to the end of the heap

    }
}
