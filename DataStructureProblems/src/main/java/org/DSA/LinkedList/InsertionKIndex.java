package org.DSA.LinkedList;

public class InsertionKIndex {
    public static void main(String[] args) {
        int[] arr = {10, 6, 4, 8, 9, 14};

        LinkedListNode head = LinkedListUtils.createLinkedList(arr);
        LinkedListUtils.printLinkedList(head);
        LinkedListNode result= LinkedListUtils.insertElement(head, 40, 6);
        LinkedListUtils.printLinkedList(head);
    }
}
