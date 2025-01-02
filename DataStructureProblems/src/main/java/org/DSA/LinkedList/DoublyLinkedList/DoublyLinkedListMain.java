package org.DSA.LinkedList.DoublyLinkedList;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("Adding nodes to the list:");
        dll.addNodeToEnd(10);
        dll.addNodeToEnd(20);
        dll.addNodeToEnd(30);
        dll.addNodeToEnd(40);
        dll.displayList(); // Output: 10 20 30 40

        System.out.println("\nAdding a node at the beginning:");
        dll.addNodeToBeginning(5);
        dll.displayList(); // Output: 5 10 20 30 40

        System.out.println("\nInserting a node with value 25 at position 3:");
        dll.insertNodeAtPosition(3, 25);
        dll.displayList(); // Output: 5 10 25 20 30 40

        System.out.println("\nInserting a node with value 15 before node with value 20:");
        dll.insertBeforeNode(20, 15);
        dll.displayList(); // Output: 5 10 25 15 20 30 40

        System.out.println("\nInserting a node with value 35 after node with value 30:");
        dll.insertAfterNode(30, 35);
        dll.displayList(); // Output: 5 10 25 15 20 30 35 40

        System.out.println("\nDeleting a node with value 25:");
        dll.deleteNode(25);
        dll.displayList(); // Output: 5 10 15 20 30 35 40

        System.out.println("\nDeleting the first node:");
        dll.deleteNodeFromBeginning();
        dll.displayList(); // Output: 10 15 20 30 35 40

        System.out.println("\nDeleting the last node:");
        dll.deleteNodeFromEnd();
        dll.displayList(); // Output: 10 15 20 30 35

        System.out.println("\nSearching for node with value 20:");
        System.out.println(dll.searchNode(20) ? "Node found." : "Node not found."); // Output: Node found.

        System.out.println("\nDisplaying the list in reverse:");
        dll.displayListReverse(); // Output: 35 30 20 15 10
    }
}
