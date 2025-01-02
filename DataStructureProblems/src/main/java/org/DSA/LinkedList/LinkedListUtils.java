package org.DSA.LinkedList;

import java.security.PublicKey;

public class LinkedListUtils {

    // Method to create a linked list from an array of integers
    public static LinkedListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        LinkedListNode head = new LinkedListNode(arr[0]);
        LinkedListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new LinkedListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print the linked list
    public static void printLinkedList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to insert a new element at a given position
    public static LinkedListNode insertElement(LinkedListNode head, int value, int position) {
        LinkedListNode newNode = new LinkedListNode(value);
        if (position <= 0 || head == null) {// If inserting at the head or if the list is empty
            newNode.next = head;
            head = newNode;
            return head;
        }

        LinkedListNode current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < position - 1) {// Traverse to the node just before the position
            current = current.next;
            currentIndex++;
        }
        if (current == null) { // If current is null, it means position is beyond the length of the list
            LinkedListNode tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        } else {
            newNode.next = current.next;// Insert the new node at the specified position
            current.next = newNode;
        }
        return head;
    }

    public static LinkedListNode deleteIndex(LinkedListNode head, int position) {
        if (head == null) return null; // List is empty
        if (position == 0) return head.next;  // delete the head node

        LinkedListNode current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }
        if (current == null || current.next == null) {// If current is null or the next node is null, the position is out of bounds
            System.out.println("Position out of bounds.");
            return head;
        }
        current.next = current.next.next;// Remove the node at the specified position
        return head;
    }

    public static LinkedListNode deleteElement(LinkedListNode head, int value) {
        if (head == null) return null;
        if (head.data == value) {
            return head.next;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    public static LinkedListNode reverseLinkedList(LinkedListNode head) {
        LinkedListNode h2 = null;
        LinkedListNode current = null;
        while (head != null) {
            current = head;
            head = head.next;
            current.next = h2;
            h2 = current;
        }
        return h2;
    }
}
