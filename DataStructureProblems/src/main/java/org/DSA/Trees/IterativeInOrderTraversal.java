package org.DSA.Trees;

import java.util.Stack;

public class IterativeInOrderTraversal {

    // Method to perform iterative in-order traversal
    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return; //if tree is empty, return
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        //Traverse the tree
        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);  // Push the current node onto the stack
                current = current.left; // Move to the left child
            }

            //current is null at this point
            current = stack.pop();  // Pop the top node from the stack
            System.out.print(current.value + " "); // Process the node (visit it)

            current = current.right; // Move to the right child of the popped node
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("In-order Traversal (Iterative):");
        inOrderTraversal(root); // Output: 4 2 5 1 6 3 7
    }
}
