package org.DSA.Trees;

import java.util.Stack;

public class IterativeInOrderTraversal {

    // Method to perform iterative in-order traversal
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return; //if tree is empty, return
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("In-order Traversal (Iterative):");
        inOrderTraversal(root); // Output: 4 2 5 1 6 3 7
    }
}
