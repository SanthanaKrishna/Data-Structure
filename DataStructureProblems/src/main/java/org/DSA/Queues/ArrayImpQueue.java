package org.DSA.Queues;

class ArrayQueues {
    private int[] arr; // Array to store queue elements
    private int front; // Index of the front element
    private int rear;  // Index of the rear element
    private int capacity; // Maximum capacity of the queue
    private int size;  // Current size of the queue

    // Constructor to initialize the queue
    public ArrayQueues(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = value;
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Method to get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek");
            return -1;
        }
        return arr[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the current size of the queue
    public int getSize() {
        return size;
    }
}

public class ArrayImpQueue {
    public static void main(String[] args) {
        // Create a queue with a capacity of 5
        ArrayQueues queue = new ArrayQueues(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        queue.dequeue();
        queue.dequeue();

        // Display current size
        System.out.println("Queue size: " + queue.getSize());

        // Enqueue more elements
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // This will indicate the queue is full

        // Dequeue the remaining elements
        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        // Attempt to dequeue from an empty queue
        queue.dequeue();
    }
}

