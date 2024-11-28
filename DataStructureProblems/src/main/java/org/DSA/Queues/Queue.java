package org.DSA.Queues;

public interface Queue<T> {
    void enqueue(T element); // Add an element to the queue
    T dequeue();             // Remove and return the front element
    T peek();                // Get the front element without removing it
    boolean isEmpty();       // Check if the queue is empty
    int size();              // Get the size of the queue
}
