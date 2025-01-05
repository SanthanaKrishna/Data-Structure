package org.DSA.Heaps;

/**
 * Complexity Analysis:
 * Insert (insert): O(log n) — Inserting an element requires restoring the heap property, which takes logarithmic time.
 * Extract (extract): O(log n) — Extracting the root and restoring the heap property by "bubbling down" also takes logarithmic time.
 * Peek (peek): O(1) — Returning the root element takes constant time.
 * Display (displayQueue): O(n) — Displaying the queue requires printing all elements.
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        // Testing MinPriorityQueue
        System.out.println("Testing MinPriorityQueue:");
        MinPriorityQueue minQueue = new MinPriorityQueue();

        // Insert elements into MinPriorityQueue
        minQueue.insert(10);
        minQueue.insert(5);
        minQueue.insert(15);
        minQueue.insert(3);
        minQueue.insert(20);

        // Display the MinPriorityQueue (heapified structure)
        System.out.println("MinPriorityQueue after insertions:");
        minQueue.displayQueue();  // Expected: [3, 5, 15, 10, 20]

        // Peek the element with the highest priority (smallest element)
        System.out.println("Peek Min (MinPriorityQueue): " + minQueue.peek());  // Expected: 3

        // Extract elements from MinPriorityQueue
        System.out.println("Extract Min (MinPriorityQueue): " + minQueue.extract());  // Expected: 3
        minQueue.displayQueue();  // Expected: [5, 10, 15, 20]

        // Testing MaxPriorityQueue
        System.out.println("\nTesting MaxPriorityQueue:");
        MaxPriorityQueue maxQueue = new MaxPriorityQueue();

        // Insert elements into MaxPriorityQueue
        maxQueue.insert(10);
        maxQueue.insert(5);
        maxQueue.insert(15);
        maxQueue.insert(30);
        maxQueue.insert(20);

        // Display the MaxPriorityQueue (heapified structure)
        System.out.println("MaxPriorityQueue after insertions:");
        maxQueue.displayQueue();  // Expected: [30, 20, 15, 10, 5]

        // Peek the element with the highest priority (largest element)
        System.out.println("Peek Max (MaxPriorityQueue): " + maxQueue.peek());  // Expected: 30

        // Extract elements from MaxPriorityQueue
        System.out.println("Extract Max (MaxPriorityQueue): " + maxQueue.extract());  // Expected: 30
        maxQueue.displayQueue();  // Expected: [20, 10, 15, 5]
    }
}
