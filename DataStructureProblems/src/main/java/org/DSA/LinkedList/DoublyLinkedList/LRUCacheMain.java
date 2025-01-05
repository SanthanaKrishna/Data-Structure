package org.DSA.LinkedList.DoublyLinkedList;

public class LRUCacheMain {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2); // Capacity = 2

        // Set values
        lruCache.set(1, 10);
        lruCache.set(5, 12);

        // Get values
        System.out.println(lruCache.get(5)); // Output: 12
        System.out.println(lruCache.get(1)); // Output: 10
        System.out.println(lruCache.get(10)); // Output: -1 (not found)

        // Update cache with new values
        lruCache.set(6, 14); // This will evict key 5 (least recently used)
        System.out.println(lruCache.get(5)); // Output: -1 (evicted)
        System.out.println(lruCache.get(6)); // Output: 14

        // Add another key
        lruCache.set(1, 15); // Key 1 is updated
        System.out.println(lruCache.get(1)); // Output: 15
        System.out.println(lruCache.get(6)); // Output: 14
    }
}
