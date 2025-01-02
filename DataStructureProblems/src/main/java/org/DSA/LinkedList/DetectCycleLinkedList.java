package org.DSA.LinkedList;

public class DetectCycleLinkedList {

    public static boolean hasCycle(LinkedListNode head) {
        if (head == null || head.next == null) return false;

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;// If slow and fast meet, there is a cycle
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);

        // Create a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect if the list contains a cycle
        boolean result = hasCycle(head);
        System.out.println("Does the linked list contain a cycle? " + result);

        // Test for a list without a cycle
        LinkedListNode head2 = LinkedListUtils.createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Does the linked list contain a cycle? " + hasCycle(head2));
    }
}
