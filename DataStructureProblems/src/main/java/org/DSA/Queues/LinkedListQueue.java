package org.DSA.Queues;

import javax.swing.plaf.PanelUI;

public class LinkedListQueue<T> implements Queue<T> {
    public static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> tail;
    private int size;

    public LinkedListQueue() {
        front = tail = null;
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            front = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        T element = front.value;
        front = front.next;
        if (front == null) {
            tail = null;
        }
        size--;
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return front.value;
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
