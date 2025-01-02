package org.DSA.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    // Add a node at the end of the list
    public void addNodeToEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a node at the beginning of the list
    public void addNodeToBeginning(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertNodeAtPosition(int position, int data) {
        if (position < 1) {
            System.out.println("Position should be 1 or greater.");
            return;
        }

        DoublyNode newNode = new DoublyNode(data);

        // Insert at the beginning
        if (position == 1) {
            addNodeToBeginning(data);
            return;
        }

        DoublyNode current = head;
        int currentPosition = 1;

        // Traverse to find the correct position
        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) { // Position is greater than the size of the list
            System.out.println("Position exceeds the size of the list. Adding at the end.");
            addNodeToEnd(data);
            return;
        }

        // Insert in the middle
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else { // If inserting at the end
            tail = newNode;
        }
        current.next = newNode;
    }

    // Insert a node before a specific node
    public void insertBeforeNode(int target, int data) {
        if (head == null) {
            System.out.println("Cannot insert, the list is empty.");
            return;
        }

        DoublyNode current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Target node not found.");
            return;
        }

        DoublyNode newNode = new DoublyNode(data);
        newNode.next = current;
        newNode.prev = current.prev;
        if (current.prev != null) {
            current.prev.next = newNode;
        } else {
            head = newNode;
        }
        current.prev = newNode;
    }

    // Insert a node after a specific node
    public void insertAfterNode(int target, int data) {
        if (head == null) {
            System.out.println("Cannot insert, the list is empty.");
            return;
        }

        DoublyNode current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Target node not found.");
            return;
        }
        DoublyNode newNode = new DoublyNode(data);
        newNode.prev = current;
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    // Delete a node from the end of the list
    public void deleteNodeFromEnd() {
        if (tail == null) { // List is empty
            System.out.println("The list is empty, nothing to delete.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete a node from the beginning of the list
    public void deleteNodeFromBeginning() {
        if (head == null) {
            System.out.println("The list is empty, nothing to delete.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // **Delete a node with a specific value**
    public void deleteNode(int value) {
        if (head == null) { // List is empty
            System.out.println("The list is empty, nothing to delete.");
            return;
        }
        DoublyNode current = head;
        // Search for the node to be deleted
        while (current != null && current.data != value) {
            current = current.next;
        }
        if (current == null) { // Node not found
            System.out.println("Node with value " + value + " not found.");
            return;
        }
        // If the node to be deleted is the head
        if (current == head) {
            deleteNodeFromBeginning();
            return;
        }
        // If the node to be deleted is the tail
        if (current == tail) {
            deleteNodeFromEnd();
            return;
        }
        // If the node to be deleted is in the middle
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Node with value " + value + " has been deleted.");
    }

    // Search for a node with a given value
    public boolean searchNode(int value) {
        DoublyNode current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Display the list in forward direction
    public void displayList() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the list in reverse order
    public void displayListReverse() {
        DoublyNode current = tail;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

}
