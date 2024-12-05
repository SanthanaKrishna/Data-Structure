package org.DSA.Trees;
/**
 * Height of Binary Tree using Recursive Implementation
 */
public class HeightBinaryTreeRecursion {

    // Method to calculate the height of a binary tree
    public static int heightBinaryTree(TreeNode root) {
        if (root == null) return 0; // Return 0 for edge-based height (or 0 for level-based height)

        // Recursive call to calculate height of left and right subtrees
        int leftHeight = heightBinaryTree(root.left);
        int rightHeight = heightBinaryTree(root.right);

        return 1+ Math.max(leftHeight, rightHeight);  // Height of the current node is 1 + max of left and right subtree heights
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calculate and print the height of the tree
        int treeHeight = heightBinaryTree(root);
        System.out.println("Height of the Binary Tree: " + treeHeight); // Output: 3
    }
}
