package org.DSA.Trees;

public class BinarySearchTreeUtils_1 {
    // Get the height of the tree
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;// The height of a tree is 1 + the maximum of the heights of the left and right subtrees
    }

    public int size(TreeNode root) { // Method to find the size of the binary tree (i.e., number of nodes)
        if (root == null) return 0; // If the node is null, return 0
        return 1 + size(root.left) + size(root.right); // Recur to left and right subtrees and sum up the result
    }

    /**
     * Check if the BST is valid.
     */
    public static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBSTHelper(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value <= min || node.value >= max) {
            return false;
        }

        return isValidBSTHelper(node.left, min, node.value) && isValidBSTHelper(node.right, node.value, max);
    }

    // Find the minimum value node in the BST
    public static int findMin(TreeNode root) {
        //Recursive Approach and here return tye is TreeNode instead of int
//        if (root == null || root.left == null) {
//            return root; // If the left child is null, the current node is the minimum
//        }
//        return findMin(root.left);// Recur down to find the minimum
        //Iterative Approach
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.left != null) {
            root = root.left; // Move to the leftmost node
        }
        return root.value;
    }

    // Find the maximum value node in the BST
    public static int findMax(TreeNode root) {
        //Recursive Approach and here return tye is TreeNode instead of int
//        if (root == null || root.right == null) {
//            return root;  // If the right child is null, the current node is the maximum
//        }
//        return findMax(root.right); // Recur down to find the maximum
        //Iterative Approach
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.right != null) {
            root = root.right; // Move to the rightmost node
        }
        return root.value;
    }

    // Delete a node with a given value from the BST
    public static TreeNode delete(TreeNode root, int value) {
        if (root == null) return null; // Base case: if the tree is empty

        if (value < root.value) {
            root.left = delete(root.left, value);  // Delete from the left subtree
        } else if (value > root.value) {
            root.right = delete(root.right, value); // Go to the right subtree
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right; // Replace with right child if left is null
            } else if (root.right == null) {
                return root.left; // Replace with left child if right is null
            }

            // Node with two children: Get the inorder successor
            root.value = findMin(root.right);
            root.right = delete(root.right, root.value); // Delete the inorder successor
        }
        return root;
    }


    public static void main(String[] args) {
        InsertionBST insert = new InsertionBST();
        InOrderTraversalBST inOrderTraversal = new InOrderTraversalBST();

        TreeNode root = null;

        // Insert values into the BST
        root = insert.insertRecursive(root, 10);
        root = insert.insertRecursive(root, 5);
        root = insert.insertRecursive(root, 15);
        root = insert.insertRecursive(root, 2);
        root = insert.insertRecursive(root, 7);
        root = insert.insertRecursive(root, 12);
        root = insert.insertRecursive(root, 20);

        // Other operations
        System.out.println("Min value: " + findMin(root));
        System.out.println("Max value: " + findMax(root));
        System.out.println("Height of the tree: " + getHeight(root));
        System.out.println("Is valid BST: " + isValidBST(root));


        // Delete a node
        root = delete(root, 7);
        System.out.print("In-order Traversal after deleting 7: ");
        inOrderTraversal.inOrderIterative(root);
        System.out.println();
    }
}
