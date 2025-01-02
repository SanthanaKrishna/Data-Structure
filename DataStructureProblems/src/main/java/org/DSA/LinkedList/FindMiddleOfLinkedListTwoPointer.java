package org.DSA.LinkedList;

/**
 * Algorithm: Two Pointers Approach (Fast and Slow Pointer):
 * Use two pointers: slow and fast.
 * slow moves one step at a time, while fast moves two steps at a time.
 * When fast reaches the end of the list, slow will be at the middle of the list.
 * The first middle: The node at position n/2.
 * The second middle: The node at position (n/2)+1.
 */
public class FindMiddleOfLinkedListTwoPointer {
    public static int findMiddle(LinkedListNode head) {
        if (head == null) throw new IllegalArgumentException("This Linked List is empty");

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {// Traverse the list with two pointers
            slow = slow.next; // Move `slow` one step
            fast = fast.next.next; // Move `fast` two steps
        }

        return slow.data; // `slow` now points to the middle node
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Input linked list
        LinkedListNode head = LinkedListUtils.createLinkedList(arr);

        int middle = findMiddle(head);
        System.out.println("The middle value of the linked list is: " + middle);
    }
}
