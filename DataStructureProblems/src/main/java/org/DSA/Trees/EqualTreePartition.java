package org.DSA.Trees;

/**
 * ---Equal Tree Partition---
 * Given the root of a binary tree, return true if the tree can be split into two non-empty subtrees with equal sums, or false otherwise.
 */
public class EqualTreePartition {
    private static boolean canPartition = false; // Global flag to track partition status

    public static boolean checkEqualTreePartition(TreeNode root) {
        int totalSum = calcTreeSum(root); // Calculate the total sum of the tree

        if (totalSum % 2 != 0) {
            return false;// If the total sum is odd, the tree cannot be split, and we return false immediately
        }
        findSubTreeSum(root, totalSum / 2, root); // Check for a valid partition (half of total sum

        return canPartition;
    }

    private static int calcTreeSum(TreeNode root) { //Calculates the total sum of the tree using recursion.
        if (root == null) return 0;

        return root.value + calcTreeSum(root.left) + calcTreeSum(root.right);
    }

    public static int findSubTreeSum(TreeNode node, int targetSum, TreeNode root) { // Recursively calculates the sum of each subtree and checks for a valid partition
        if (node == null) return 0;

        int leftSubTreeSum = findSubTreeSum(node.left, targetSum, root);
        int rightSubTreeSum = findSubTreeSum(node.right, targetSum, root);

        int subTreeSum = node.value + leftSubTreeSum + rightSubTreeSum; // Calculate the sum of the current subtree

        if (subTreeSum == targetSum && node != root) { // Check if this subtree's sum equals the target sum, ensuring it's not the entire tree
            canPartition = true;
        }

        return subTreeSum;
    }

    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        // Check if the tree can be partitioned
        boolean result = checkEqualTreePartition(root);
        System.out.println("Can the tree be split into two equal subtrees? " + result);
    }
}
