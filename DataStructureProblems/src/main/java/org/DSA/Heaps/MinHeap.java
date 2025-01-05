package org.DSA.Heaps;

import java.util.ArrayList;

public class MinHeap {
    private final ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    private int parentIndex(int index) { // Get the index of the parent node
        return (index - 1) / 2;
    }

    private int letChildIndex(int index) { // Get the index of the left child node
        return 2 * index + 1;
    }

    private int rightChildIndex(int index) { // Get the index of the right child node
        return 2 * index + 2;
    }

    private void swap(int i, int j) { // Swap two elements in the heap
        int temp = heap.get(i);
        heap.set(i, heap.get(j)); //index, value
        heap.set(j, temp);
    }

    public void insert(int value) { // Insert a new element into the heap
        heap.add(value);// Add the element to the end
        upHeapfiy(); // Perform upheapify to maintain the heap order property
    }

    public void upHeapfiy() {  //perform upheapify to maintain head order property
        int currentIndex = heap.size() - 1;

        // Bubble up (heapify up) to maintain the heap order property
        while (currentIndex > 0) {
            int parentIdx = parentIndex(currentIndex);
            int parentValue = heap.get(parentIdx);
            int currentValue = heap.get(currentIndex);
            if (currentValue < parentValue) { // Compare the current node with its parent
                swap(currentIndex, parentIdx);
                currentIndex = parentIdx;
            } else {
                break; // If no swap is needed, stop the loop
            }
        }
    }

    public void downHeapify(int index) {
        int smallest = index;
        int len = heap.size();
        int left = letChildIndex(index);
        int right = rightChildIndex(index);

        if (left < len && heap.get(left) < heap.get(smallest)) {  // If the left child is smaller than the root
            smallest = left;
        }
        if (right < len && heap.get(right) < heap.get((smallest))) { // If the right child is smaller than the smallest so far
            smallest = right;
        }

        // If the smallest is not the parent, swap and continue heapifying down
        if (smallest != index) {
            swap(index, smallest);
            downHeapify(smallest);
        }
    }

    public int extractMin() { // Extract the minimum element (root of the heap)
        int len = heap.size();
        if (len == 0) throw new IllegalStateException("Head is empty.");

        int minValue = heap.get(0);
        int lastIndex = len - 1;

        swap(0, lastIndex); // Swap the root with the last element
        heap.remove(lastIndex);

        if (heap.size() > 0) {// Restore the heap property
            downHeapify(0); // Heapify down to restore the heap property
        }
        return minValue;
    }

    public int peekMin() {
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
