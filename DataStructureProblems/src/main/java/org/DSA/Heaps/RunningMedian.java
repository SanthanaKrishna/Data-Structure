package org.DSA.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Running Median
 * Flipkart is currently dealing with the difficulty of precisely estimating and displaying the expected delivery time for orders to a specific pin code.
 * The existing method relies on historical delivery time data for that pin code, using the median value as the expected delivery time. As the order history expands with new entries, Flipkart aims to enhance this process by dynamically updating the expected delivery time whenever a new delivery time is added.
 * The objective is to find the expected delivery time after each new element is incorporated into the list of delivery times.
 * End Goal: With every addition of new delivery time, requirement is to find the median value.
 * Why Median ?
 * The median is calculated because it provides a more robust measure of the expected delivery time The median is less sensitive to outliers or extreme values than the mean.
 * In the context of delivery times, this is crucial because occasional delays or unusually fast deliveries (outliers) can skew the mean significantly, leading to inaccurate estimations.
 * Given an array of integers, A denoting the delivery times for each order.
 * New arrays of integer B and C are formed, each time a new delivery data is encountered, append it at the end of B and append the median of array B at the end of C.
 * Your task is to find and return the array C.
 * NOTE:
 * If the number of elements is N in B and N is odd, then consider the median as B[N/2] ( B must be in sorted order).
 * If the number of elements is N in B and N is even, then consider the median as B[N/2-1]. ( B must be in sorted order).
 * Explanation of the Problem
 * The median of a dataset is the value separating the higher half from the lower half.
 * If the dataset has an odd number of elements, the median is the middle element when sorted.
 * If the dataset has an even number of elements, the median is the average of the two middle elements when sorted.
 * Example Provided:
 * The dataset [1, 2, 5, 4, 3, 6]:
 * After sorting: [1, 2, 3, 4, 5, 6]
 * Since the size is even, the median is the average of the two middle elements, i.e., (3 + 4) / 2 = 3.5.
 * Example Execution
 * For the input stream {9, 6, 3, 10, 4}, the output would be:
 * Add 9: Median is 9 (since there's only one number).
 * Add 6: Median is (6+9)/2 = 7.5.
 * Add 3: Median is 6 (middle number of {3, 6, 9}).
 * Add 10: Median is (6+9)/2 = 7.5.
 * Add 4: Median is 6 (middle number of {3, 4, 6, 9, 10}).
 * To efficiently calculate the running median for a stream of numbers, we can use two heaps:
 * Max-Heap for the lower half of the numbers (smaller half).
 * Min-Heap for the upper half of the numbers (larger half)
 * Steps:
 * For each new number:
 * Add the number to the appropriate heap (either max-heap or min-heap).
 * Balance the heaps if their sizes differ by more than one element.
 * After balancing:
 * If the heaps have the same size, the median is the average of the max of the max-heap and the min of the min-heap.
 * If one heap has more elements, the median is the root of that heap.
 */

public class RunningMedian {
    private PriorityQueue<Integer> maxHeap;// Max-Heap for the lower half of the numbers
    private PriorityQueue<Integer> minHeap;// Min-Heap for the upper half of the numbers

    public RunningMedian() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());  //max Heap
        minHeap = new PriorityQueue<>(); //min Heap
    }

    public void addNumber(int num) {  // Function to add a number to the heaps
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {  //maxHeap.peek() returns the largest element from the maxHeap without removing it.
            maxHeap.add(num);  // Add to Max-Heap if it's smaller or equal to maxHeap's root
        } else {
            minHeap.add(num);  // Otherwise, add to Min-Heap
        }

        if (maxHeap.size() > minHeap.size() + 1) {   // Balancing the heaps: we need to balance the two heaps so that the difference in their sizes is at most 1.
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
 * Explanation of the Code:
 * Heaps Initialization:
 * maxHeap is a Max-Heap that holds the smaller half of the numbers (left side).
 * minHeap is a Min-Heap that holds the larger half of the numbers (right side).
 * <p>
 * Adding Numbers:
 * If the number is less than or equal to the root of the maxHeap, it goes into the maxHeap.
 * If it's greater, it goes into the minHeap.
 * <p>
 * Balancing Heaps:
 * If the size of the maxHeap exceeds the size of the minHeap by more than 1, move the root of the maxHeap to the minHeap.
 * If the minHeap becomes larger, move its root to the maxHeap.
 * <p>
 * Getting the Median:
 * If both heaps have the same size, the median is the average of the roots of the two heaps.
 * If the heaps are of unequal size, the median is the root of the maxHeap (since it will have one extra element).
 * <p>
 * Main Method:
 * The main method simulates adding numbers to the stream and prints the running median after each insertion.
 */