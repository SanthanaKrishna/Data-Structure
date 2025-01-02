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

        System.out.println("\nSearching for node with value 20:");
        System.out.println(dll.searchNode(20) ? "Node found." : "Node not found."); // Should output: Node found.

        System.out.println("\nSearching for node with value 50:");
        System.out.println(dll.searchNode(50) ? "Node found." : "Node not found."); // Should output: Node not found.

        System.out.println("\nInserting a node with value 25 at position 3:");
        dll.insertNodeAtPosition(3, 25);
        dll.displayList(); // Output: 5 10 25 20 30 40

        System.out.println("\nSearching for node with value 25:");
        System.out.println(dll.searchNode(25) ? "Node found." : "Node not found."); // Should output: Node found.

        System.out.println("\nInserting a node with value 15 before node with value 20:");
        dll.insertBeforeNode(20, 15);
        dll.displayList(); // Output: 5 10 25 15 20 30 40

        System.out.println("\nSearching for node with value 15:");
        System.out.println(dll.searchNode(15) ? "Node found." : "Node not found."); // Should output: Node found.
    }
}
