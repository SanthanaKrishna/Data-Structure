package org.DSA.Queues;

import java.util.Arrays;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> arrayQueue  = new ArrayQueue<>(5);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
        arrayQueue.enqueue(9);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(7);
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(20);
        System.out.println("ArrayQueue Dequeue: " + arrayQueue.dequeue());
        System.out.println("ArrayQueue Peek: " + arrayQueue.peek());
        System.out.println("ArrayQueue Size: " + arrayQueue.size());
        //array queue 3 7 11 20
    }
}
