package org.DSA.Heaps;

import java.util.ArrayList;

public class MaxHeap {
    private final ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    private int parentIndex(int index) {  // Get the index of the parent node
        return (index - 1) / 2;
    }

    private int leftChildIndex(int index) { // Get the index of the left child node
        return 2 * index + 1;
    }

    private int rightChildIndex(int index) {  // Get the index of the right child node
        return 2 * index + 2;
    }

    private void swap(int i, int j) {  // Swap two elements in the heap
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }


    public void insert(int value) {  // Insert a new element into the heap
        heap.add(value); // Add the element to the end of the heap
        upHeapify();     // Restore the Max Heap property
    }

    private void upHeapify() {   // Perform upheapify to maintain the heap property (bubble up)
        int currentIndex = heap.size() - 1; // Restore the Max Heap property

        while (currentIndex > 0) { // Bubble up until the parent is greater or the root is reached
            int parentIdx = parentIndex(currentIndex);
            int parentValue = heap.get(parentIdx);
            int currentValue = heap.get(currentIndex);

            if (currentValue > parentValue) { // If the current node is larger than the parent, swap
                swap(currentIndex, parentIdx);
                currentIndex = parentIdx;  // Move up to the parent
            } else {
                break;  // If no more swaps needed, break the loop
            }
        }
    }

    private void downHeapify(int index) { // Perform downheapify to maintain the heap property (bubble down)
        int largest = index;
        int len = heap.size();
        int left = leftChildIndex(index);
        int right = rightChildIndex(index);

        if (left < len && heap.get(left) > heap.get(largest)) { // Check if the left child is larger than the current node
            largest = left;
        }

        if (right < len && heap.get(right) > heap.get(largest)) { // Check if the right child is larger than the current largest
            largest = right;
        }
        if (largest != index) {  // If the largest element is not the current node, swap and continue heapifying
            swap(index, largest);
            downHeapify(largest);   // Recurse on the affected subtree
        }
    }

    public int extractMax() {   // Extract the maximum element (root) from the heap
        int len = heap.size();
        if (len == 0) throw new IllegalStateException("Heap is empty");

        int maxValue = heap.get(0); // The root is the maximum element
        int lastIndex = len - 1;

        swap(0, lastIndex); // Swap the root with the last element
        heap.remove(lastIndex);  // Remove the last element (now the root)

        if (heap.size() > 0) {
            downHeapify(0); // Restore the Max Heap property by calling downHeapify
        }
        return maxValue;
    }


    public int peekMax() {   // Peek the maximum element (root) without removing it
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty.");
        }
        return heap.get(0);
    }

    public void displayHeap() {
        System.out.println(heap);
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
