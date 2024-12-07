package org.DSA.Trees;

import java.util.Stack;

public class PostOrderTraversalBST {

    //Perform Post-Order Traversal (Recursive Approach).
    public void postOrderRecursive(TreeNode root) {
        if (root == null) {
            return; // Base case: If the node is null, return
        }

        postOrderRecursive(root.left);  // Recur on the left subtree
        postOrderRecursive(root.right); // Recur on the right subtree
        System.out.print(root.value + " "); // Visit the root
    }

    //Perform Post-Order Traversal (Iterative Approach)
    public void postOrderIterative(TreeNode root) {
        if (root == null) {
            return; // If the tree is empty, return
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>(); // Auxiliary stack to hold post-order traversal
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            output.push(current);

            // Push left and right children onto the stack
            if (current.left != null) {
                stack.push(current.left);
            }
            if (current.right != null) {
                stack.push(current.right);
            }
        }

        // Print nodes in post-order
        while (!output.isEmpty()) {
            System.out.print(output.pop().value + " ");
        }
    }

    public static void main(String[] args) {
        PostOrderTraversalBST postOrderTraversal = new PostOrderTraversalBST();

        // Create a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        // Perform Post-Order Traversal (Recursive)
        System.out.print("Post-Order Traversal (Recursive): ");
        postOrderTraversal.postOrderRecursive(root);
        System.out.println();

        // Perform Post-Order Traversal (Iterative)
        System.out.print("Post-Order Traversal (Iterative): ");
        postOrderTraversal.postOrderIterative(root);
        System.out.println();
    }
}
