package org.DSA.Queues;

public class ArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is Full");
        }
        rear = (rear + 1) % capacity; //capacity is n
        array[rear] = value;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        T value = array[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    @Override
    public T peek() { // this method to get front element of queue
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return array[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
