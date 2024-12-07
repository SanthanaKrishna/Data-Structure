package org.DSA.Trees;

import java.util.Stack;

/**
 * In-Order Traversal
 */
public class InOrderTraversalBST {

    //Perform In-Order Traversal (Recursive Approach).
    public void inOrderRecursive(TreeNode root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }

        inOrderRecursive(root.left);      // Recur on the left subtree
        System.out.print(root.value + " "); // Visit the root
        inOrderRecursive(root.right);     // Recur on the right subtree

    }

    // Perform In-Order Traversal (Iterative Approach).
    public void inOrderIterative(TreeNode root) {
        if (root == null) {
            return; //if tree is empty, return
        }

        Stack<TreeNode> stack = new Stack<>(); // Use a stack for iterative traversal
        TreeNode current = root;

        //Traverse the tree
        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (current != null) {
                stack.push(current);  // Push the current node onto the stack
                current = current.left; // Move to the left child
            }

            current = stack.pop();  // Pop the top node from the stack
            System.out.print(current.value + " "); // Process the node (visit it)

            current = current.right; // Move to the right child of the popped node
        }
    }

    public static void main(String[] args) {
        InOrderTraversalBST inOrderTraversal = new InOrderTraversalBST();
        // Create a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        // Perform In-Order Traversal (Recursive)
        System.out.print("In-Order Traversal (Recursive): ");
        inOrderTraversal.inOrderRecursive(root);
        System.out.println();

        // Perform In-Order Traversal (Iterative)
        System.out.print("In-Order Traversal (Iterative): ");
        inOrderTraversal.inOrderIterative(root);
        System.out.println();
    }
}
