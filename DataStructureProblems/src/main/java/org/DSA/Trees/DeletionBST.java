package org.DSA.Trees;

public class DeletionBST {
    // The line `root.value = findMin(root.right);`:
    // 1. Replaces the value of the node to be deleted with the smallest value in its right subtree (the in-order successor).
    // 2. Maintains the BST property after deletion.
    // 3. Is followed by deleting the actual in-order successor from the right subtree.
    private static int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    public TreeNode deleteRecursive(TreeNode root, int key) {
        if (root == null) return null; // Base case: Tree is empty

        if (key < root.value) {
            root.left = deleteRecursive(root.left, key);// If key is smaller, search in the left subtree
        } else if (key > root.value) {
            root.right = deleteRecursive(root.right, key);// If key is larger, search in the right subtree
        } else { // case2: if one child exist
            if (root.left == null) {
                return root.right; // Replace with right child
            } else if (root.right == null) {
                return root.left;// Replace with left child
            }

            // case3: if both children exist
            root.value = findMin(root.right);// Get the in-order successor (smallest in the right subtree)
            root.right = deleteRecursive(root.right, root.value); // Delete the in-order successor
        }
        return root;
    }

    public static void main(String[] args) {
        InsertionBST insert = new InsertionBST();
        InOrderTraversalBST inOrderTraversal = new InOrderTraversalBST();
        DeletionBST delete = new DeletionBST();
        TreeNode root = null;

        // Insert values into the BST
        root = insert.insertRecursive(root, 50);
        root = insert.insertRecursive(root, 30);
        root = insert.insertRecursive(root, 20);
        root = insert.insertRecursive(root, 40);
        root = insert.insertRecursive(root, 70);
        root = insert.insertRecursive(root, 60);
        root = insert.insertRecursive(root, 80);

        // In-order traversal before deletion
        System.out.println("In-order traversal before deletion:");
        inOrderTraversal.inOrderRecursive(root);
        System.out.println();

        // Delete nodes
        System.out.println("Deleting 20...");
        root = delete.deleteRecursive(root, 20);
        System.out.println("In-order traversal after deleting 20:");
        inOrderTraversal.inOrderRecursive(root);
        System.out.println();

        System.out.println("Deleting 30...");
        root = delete.deleteRecursive(root, 30);
        System.out.println("In-order traversal after deleting 30:");
        inOrderTraversal.inOrderRecursive(root);
        System.out.println();

        System.out.println("Deleting 50...");
        root = delete.deleteRecursive(root, 50);
        System.out.println("In-order traversal after deleting 50:");
        inOrderTraversal.inOrderRecursive(root);
        System.out.println();
    }
}
