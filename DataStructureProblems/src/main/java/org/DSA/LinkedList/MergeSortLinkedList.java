package org.DSA.LinkedList;

public class MergeSortLinkedList {

    private static LinkedListNode merge(LinkedListNode left, LinkedListNode right) {
        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode current = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }

    private static LinkedListNode getMiddle(LinkedListNode head) {
        if (head == null) return null;

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // `slow` points to the middle node
    }

    // Split the list into two halves and sort them recursively
    private static LinkedListNode mergeSort(LinkedListNode head) {
        if (head == null || head.next == null)
            return head; // Base case: if the list has 0 or 1 node, it is already sorted

        // Find the middle of the list using slow and fast pointers
        LinkedListNode mid = getMiddle(head);
        LinkedListNode nextToMid = mid.next;
        mid.next = null; // Split the list into two halves

        // Recursively sort each half
        LinkedListNode left = mergeSort(head);
        LinkedListNode right = mergeSort(nextToMid);

        return merge(left, right);
    }

    public static LinkedListNode sortLinkedList(LinkedListNode head) {
        return mergeSort(head);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5, 7, 6}; // Input linked list
        LinkedListNode head = LinkedListUtils.createLinkedList(arr);

        System.out.print("Original Linked List: ");
        LinkedListUtils.printLinkedList(head);

        LinkedListNode sortedHead = sortLinkedList(head);

        System.out.print("Sorted Linked List: ");
        LinkedListUtils.printLinkedList(sortedHead);
    }
}
