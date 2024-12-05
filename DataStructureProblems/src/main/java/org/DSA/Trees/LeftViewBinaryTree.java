package org.DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find left view of binary tree
 */
public class LeftViewBinaryTree {

    public static void printLeftView(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the number of nodes at the current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();// Remove the front node

                if (i == 0) { // If this is the first node of the current level, print it
                    System.out.print(currentNode.value + " ");
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        System.out.println("Tree root: " + root);
        // Print the left view of the binary tree
        System.out.println("Left View of the Binary Tree:");
        printLeftView(root);
    }
}
