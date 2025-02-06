package org.DSA.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Level Order Traversal
 */
public class LevelOrderTraversal {
    // Method to perform Level Order Traversal
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // To store the level order traversal

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>(); // Initialize the queue
        queue.offer(root); // Add the root to the queue

        while (!queue.isEmpty()) {
            int levelSize = queue.size();// Number of nodes at the current level
            List<Integer> currentLevel = new ArrayList<>(); // To store nodes of the current level

            // Traverse all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();// Get the node from the front of the queue
                currentLevel.add(currentNode.value);// Add its value to the current level list

                if (currentNode.left != null) {// Add the left child to the queue if it exists
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) { // Add the right child to the queue if it exists
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);// Add the current level to the result
        }
        return result;
    }

    public static void main(String[] args) {
// Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order traversal
        List<List<Integer>> result = levelOrder(root);

        // Print the result
        System.out.println("Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
