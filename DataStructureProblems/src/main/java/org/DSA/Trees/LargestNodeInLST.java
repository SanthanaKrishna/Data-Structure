package org.DSA.Trees;

public class LargestNodeInLST {
    public static Integer findLargestInLST(TreeNode root) {
        if (root == null || root.left == null) {
            return null;  //No left subtree exists
        }

        TreeNode current = root.left; // Start with the left child
        while (current.right != null) {
            current = current.right; // Move to the rightmost node
        }

        return current.value; // Rightmost node in the left subtree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        // Level 1
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);

        // Level 2
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(13);
        root.right.right = new TreeNode(38);

        // Level 3
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(34);
        root.right.right.right = new TreeNode(45);

        // Level 4
        root.right.right.left.left = new TreeNode(31);
        root.right.right.left.right = new TreeNode(35);
        root.right.right.right.right = new TreeNode(55);

        // Level 5
        root.right.right.left.left.left = new TreeNode(30);
        root.right.right.left.right.right = new TreeNode(36);

        // Level 6
        root.right.right.left.right.right.right = new TreeNode(37);

        // Find the largest node in LST for given nodes
        System.out.println("Largest in LST of 15: " + findLargestInLST(root)); // LST of 15
        System.out.println("Largest in LST of 38: " + findLargestInLST(root.right.right)); // LST of 38
        System.out.println("Largest in LST of 6: " + findLargestInLST(root.left.left)); // LST of 6
    }
}
