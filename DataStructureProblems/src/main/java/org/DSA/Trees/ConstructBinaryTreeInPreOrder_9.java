package org.DSA.Trees;

import java.util.HashMap;

/**
 * construct the binary tree from in-order and pre-order, given two arrays in[] and pre[]
 */
public class ConstructBinaryTreeInPreOrder_9 {
    public static TreeNode buildTree(int[] preOrder, int[] inOrder) {// Helper method to build the binary tree
        if (preOrder == null || inOrder == null || preOrder.length != inOrder.length) {
            return null;
        }
        HashMap<Integer, Integer> inOrderMap = new HashMap<>(); // Create a map to store the index of each element in the inOrder array
        for (int i = 0; i < inOrder.length; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        // Start building the tree
        return buildTreeHelper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length, inOrderMap);
    }

    private static TreeNode buildTreeHelper(int[] preOrder, int preStart, int preEnd,
                                            int[] inOder, int inStart, int inEnd,
                                            HashMap<Integer, Integer> inOrderMap) {
        if (preStart > preEnd || inStart > inEnd) { //Base Case
            return null;
        }

        // Get the root value and create the root node
        int rootValue = preOrder[preStart];
        TreeNode root = new TreeNode(rootValue);
        int rootIndex = inOrderMap.get(rootValue);// Get the index of the root value in the inOrder array
        int leftSubTreeSize = rootIndex - inStart; // Calculate the number of elements in the left subtree [inStart rootIndex-1] --> rootIndex-1-inStart+1 = rootIndex-inStart //[a-b]=b-a+1

        // Recursively build the left and right subtrees
        root.left = buildTreeHelper(preOrder, preStart + 1, preStart + leftSubTreeSize,
                inOder, inStart, rootIndex - 1, inOrderMap);
        root.right = buildTreeHelper(preOrder, preStart + leftSubTreeSize + 1, preEnd,
                inOder, rootIndex + 1, inEnd, inOrderMap);

        return root;
    }

    public static void printInOrder(TreeNode root) {// Method to print the tree (in-order traversal for testing)
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        int[] preOrder = {8, 6, 5, 15, 19, 9, 18, 25, 4, 7, 41, 30, 39, 48};
        int[] inOrder = {15, 5, 19, 6, 18, 9, 25, 8, 7, 41, 4, 39, 30, 48};

        TreeNode root = buildTree(preOrder, inOrder);// Build the tree
        // Print the tree in in-order to verify
        System.out.print("In-order traversal of the constructed tree: ");
        printInOrder(root); // Output should match the original inOrder array
    }
}
