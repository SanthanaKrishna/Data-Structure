package org.DSA.Trees;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {// Method to check if the tree is balanced
        return checkHeight(root) != -1;
    }

    private static int checkHeight(TreeNode node) {// Helper function to calculate the height and check for balance
        if (node == null) return 0; // Base case: height of null node is 0

        // Helper function to calculate the height and check for balance
        int leftHeight = checkHeight(node.left);
        int rightHeight = checkHeight(node.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) { // If either subtree is unbalanced, propagate the -1 result upwards
            return -1; // Tree is unbalanced
        }

        return Math.max(leftHeight, rightHeight) + 1; // Return the height of the current node
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);  // Create an example binary tree
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        boolean result = isBalanced(root); // Check if the binary tree is balanced
        System.out.println("Is the binary tree balanced? " + result);
    }
}
