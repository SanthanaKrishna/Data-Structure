package org.DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Height of Binary Tree using Iterative Implementation
 */
public class HeightBinaryTreeIterative {

    public static int heightBinaryTree(TreeNode root) {
        if (root == null) return 0; // Return 0 for edge-based height (or 0 for level-based height)

        Queue<TreeNode> queue = new LinkedList<>(); // Create a queue for TreeNode objects
        queue.offer(root);  // Enqueue the root
        int height = -1; // Start with -1 for edge-based height

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level

            for (int i = 0; i < levelSize; i++) { // Process all nodes at the current level
                TreeNode current = queue.poll(); // Remove and retrieve the front node

                // Enqueue left and right children (if they exist)
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            height++; // Increment height after processing a level
        }
        return height;
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
