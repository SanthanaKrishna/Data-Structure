package org.DSA.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Explanation of the Problem
 * The median of a dataset is the value separating the higher half from the lower half.
 * If the dataset has an odd number of elements, the median is the middle element when sorted.
 * If the dataset has an even number of elements, the median is the average of the two middle elements when sorted.
 * Example Provided:
 * The dataset [1, 2, 5, 4, 3, 6]:
 * After sorting: [1, 2, 3, 4, 5, 6]
 * Since the size is even, the median is the average of the two middle elements, i.e., (3 + 4) / 2 = 3.5.
 */

public class RunningMedian {
    private PriorityQueue<Integer> maxHeap;// Max-Heap for the lower half of the numbers

    private PriorityQueue<Integer> minHeap;// Min-Heap for the upper half of the numbers

    public RunningMedian() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());  //max Heap
        minHeap = new PriorityQueue<>(); //min Heap
    }

    public void addNumber(int num) {  // Function to add a number to the heaps
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);  // Add to Max-Heap if it's smaller or equal to maxHeap's root
        } else {
            minHeap.add(num);  // Otherwise, add to Min-Heap
        }

        if (maxHeap.size() > minHeap.size() + 1) {   // Balancing the heaps
            minHeap.add(maxHeap.poll());  // Move the root of Max-Heap to Min-Heap
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());  // Move the root of Min-Heap to Max-Heap
        }
    }

    public double getMedian() {
        if (maxHeap.size() == minHeap.size()) {
            double median = (maxHeap.peek() + minHeap.peek()) / 2.0;  // If heaps are the same size, the median is the average of the roots of both heaps
            return median;
        } else {
            return maxHeap.peek(); // Otherwise, the median is the root of the Max-Heap (because it has more elements)
        }
    }

    public static void main(String[] args) {
        RunningMedian runningMedium = new RunningMedian();
        int[] stream = {9, 6, 3, 10, 4};
        System.out.println("Running Medians:");
        for (int num : stream) {
            runningMedium.addNumber(num);
            System.out.println("Median after adding " + num + " is: " + runningMedium.getMedian());
        }
    }
}

/**
 * How to Find Running Median Efficiently?
 * To efficiently calculate the running median for a stream of numbers, we can use two heaps:
 * Max-Heap for the lower half of the numbers (smaller half).
 * Min-Heap for the upper half of the numbers (larger half).
 * Steps:
 * For each new number:
 * Add the number to the appropriate heap (either max-heap or min-heap).
 * Balance the heaps if their sizes differ by more than one element.
 * After balancing:
 * If the heaps have the same size, the median is the average of the max of the max-heap and the min of the min-heap.
 * If one heap has more elements, the median is the root of that heap.
 *
 * Explanation of the Code:
 * Heaps Initialization:
 * maxHeap is a Max-Heap that holds the smaller half of the numbers (left side).
 * minHeap is a Min-Heap that holds the larger half of the numbers (right side).

 * Adding Numbers:
 * If the number is less than or equal to the root of the maxHeap, it goes into the maxHeap.
 * If it's greater, it goes into the minHeap.

 * Balancing Heaps:
 * If the size of the maxHeap exceeds the size of the minHeap by more than 1, move the root of the maxHeap to the minHeap.
 * If the minHeap becomes larger, move its root to the maxHeap.

 * Getting the Median:
 * If both heaps have the same size, the median is the average of the roots of the two heaps.
 * If the heaps are of unequal size, the median is the root of the maxHeap (since it will have one extra element).

 * Main Method:
 * The main method simulates adding numbers to the stream and prints the running median after each insertion.
 */