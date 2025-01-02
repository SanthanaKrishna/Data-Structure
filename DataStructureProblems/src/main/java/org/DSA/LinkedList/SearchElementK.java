package org.DSA.LinkedList;

public class SearchElementK {
    static boolean findValue(LinkedListNode head, int K) {
        LinkedListNode current = head;
        while (current != null) {
            if (current.data == K) return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Using createLinkedList method to create the linked list
        LinkedListNode head = LinkedListUtils.createLinkedList(arr);

        System.out.print("Linked list: ");
        LinkedListUtils.printLinkedList(head);  // Calling printLinkedList from LinkedListUtil

        // Searching for elements
        boolean result = findValue(head, 5);
        System.out.println("Element 5 found: " + result);
        System.out.println("Element 11 found: " + findValue(head, 11));
    }
}
