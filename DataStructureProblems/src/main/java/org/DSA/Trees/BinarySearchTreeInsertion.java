package org.DSA.Trees;

public class BinarySearchTreeInsertion {

    // Insert a value into the BST (Recursive Approach).
    public TreeNode insertRecursive(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value); // Create a new node if the tree is empty
        }
        if (value < root.value) {
            root.left = insertRecursive(root.left, value); // Recur into the left subtree
        } else if (value > root.value) {
            root.right = insertRecursive(root.right, value); // Recur into the right subtree
        }
        return root;
    }

    //Insert a value into the BST (Iterative Approach)
    public TreeNode insertIterative(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value); // create a new node
        if (root == null) {
            return newNode;// If the tree is empty, the new node becomes the root
        }

        TreeNode current = root;
        TreeNode parent = null;

        while (current != null) {
            parent = current; // Keep track of the parent node
            if (value < current.value) {
                current = current.left; // Move to the left subtree
            } else if (value > current.value) {
                current = current.right; // Move to the right subtree
            } else {
                return root; // If the value already exists, return the original root
            }
        }

        if (value < parent.value) {// Attach the new node to the appropriate parent
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return root;
    }
}
