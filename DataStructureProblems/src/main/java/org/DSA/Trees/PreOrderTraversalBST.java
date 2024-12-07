package org.DSA.Trees;

import java.util.Stack;

public class PreOrderTraversalBST {
    //Perform Pre-Order Traversal (Recursive Approach)
    public void preOrderRecursive(TreeNode root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }

        System.out.print(root.value + " ");  // visit the root
        preOrderRecursive(root.left); // Recur on the left subtree
        preOrderRecursive(root.right); // Recur on the right subtree
    }

    //Perform Pre-Order Traversal (Iterative Approach).
    public void preOrderIterative(TreeNode root) {
        if (root == null) {
            return; //If the tree is empty, return
        }

        Stack<TreeNode> stack = new Stack<>();  // Use a stack to simulate recursion
        stack.push(root); // Start with the root node

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop(); // Get the top node
            System.out.print(current.value + " "); // visit the root node

            if (current.right != null) {// Push right child first so that left child is processed first
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    public static void main(String[] args) {
        PreOrderTraversalBST preOrderTraversal = new PreOrderTraversalBST();

        // Create a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        // Perform Pre-Order Traversal (Recursive)
        System.out.print("Pre-Order Traversal (Recursive): ");
        preOrderTraversal.preOrderRecursive(root);
        System.out.println();

        // Perform Pre-Order Traversal (Iterative)
        System.out.print("Pre-Order Traversal (Iterative): ");
        preOrderTraversal.preOrderIterative(root);
        System.out.println();
    }
}
