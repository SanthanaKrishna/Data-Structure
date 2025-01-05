package org.DSA.LinkedList.DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cacheMap;
    private final DoublyLinkedListLRU dll;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.dll = new DoublyLinkedListLRU();
    }

    private static class Node { // Doubly Linked List Node
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;// Key not found
        }
        // Move the accessed node to the front (most recently used)
        Node node = cacheMap.get(key);
        dll.moveToFront(node);
        return node.value;
    }

    // Set or insert a new key-value pair
    public void set(int key, int value) {
        if (cacheMap.containsKey(key)) {
            // Update the value and move to the front
            Node node = cacheMap.get(key);
            node.value = value;
            dll.moveToFront(node);
        } else {
            if (cacheMap.size() >= capacity) {
                // Remove the least recently used (LRU) item
                Node lruNode = dll.removeLast();
                cacheMap.remove(lruNode.key);
            }
            // Add the new key-value pair
            Node newNode = new Node(key, value);
            dll.addToFront(newNode);
            cacheMap.put(key, newNode);
        }
    }

    // Doubly Linked List for tracking the order of usage
    private static class DoublyLinkedListLRU {
        private final Node head;
        private final Node tail;

        DoublyLinkedListLRU() {
            head = new Node(-1, -1); // Dummy head
            tail = new Node(-1, -1);// Dummy tail
            head.next = tail;
            tail.prev = head;
        }

        void addToFront(Node node) { // Add a node to the front (most recently used)
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        // Remove a node from the list
        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        // Move a node to the front
        void moveToFront(Node node) {
            remove(node);
            addToFront(node);
        }

        // Remove the last node (least recently used)
        Node removeLast() {
            if (tail.prev == head) {
                return null; // List is empty
            }
            Node lruNode = tail.prev;
            remove(lruNode);
            return lruNode;
        }
    }
}
