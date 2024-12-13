package org.DSA.Trees;
//Definition of search :A tree where for a node x, everything on the left has data <= x and on the right > x.
public class SearchingKInBinaryTree {
    //Search for an element K in the BST (Recursive Approach).
    public boolean searchBinaryRecursive(TreeNode root, int K) {
        if (root == null) {
            return false; // K is not found
        }
        if (root.value == K) {
            return true; // K is found
        }
        if (K < root.value) {
            return searchBinaryRecursive(root.left, K); // Search in left subtree
        } else {
            return searchBinaryRecursive(root.right, K); // Search in right subtree
        }
    }

    //Search for an element K in the BST (Iterative Approach)
    public boolean searchBinaryIterative(TreeNode root, int K) {
        while (root != null) {
            if (K == root.value) {
                return true; // K is found
            }
            if (K < root.value) {
                root = root.left; // Move to left subtree
            } else {
                root = root.right; // Move to right subtree
            }
        }
        return false; // K is not found;
    }

}
