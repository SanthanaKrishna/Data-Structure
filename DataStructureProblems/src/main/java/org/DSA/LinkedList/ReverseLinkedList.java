package org.DSA.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] arr = {10, 6, 4, 8, 9, 14};
        LinkedListNode head = LinkedListUtils.createLinkedList(arr);
        System.out.println("Original Linked List:");
        LinkedListUtils.printLinkedList(head);
        LinkedListNode reverseList = LinkedListUtils.reverseLinkedList(head);
        System.out.println("Reversed Linked List:");
        LinkedListUtils.printLinkedList(reverseList);
    }
}
