package org.DSA.Trees;

public class BinaryTreeMain {
    public static void main(String[] args) {
        InsertionBST bstInsert = new InsertionBST();
        SearchingKInBinaryTree bstSearch = new SearchingKInBinaryTree();
        TreeNode root = null;

        // Insert elements into the BST using the recursive approach
        root = bstInsert.insertRecursive(root, 10);
        root = bstInsert.insertRecursive(root, 5);
        root = bstInsert.insertRecursive(root, 15);
        root = bstInsert.insertRecursive(root, 2);
        root = bstInsert.insertRecursive(root, 7);

        // Insert elements into the BST using the iterative approach
        root = bstInsert.insertIterative(root, 12);
        root = bstInsert.insertIterative(root, 20);

        // Display the BST using an in-order traversal
        inOrderTraversal(root); // Should print: 2 5 7 10 12 15 20

//        // Display the BST using in-order traversal
//        System.out.print("In-order Traversal: ");
//        bst.inOrderTraversal(root);
//        System.out.println();

        // Search for elements using recursive approach
        System.out.println("Search (Recursive):");
        System.out.println("Is 7 present? " + bstSearch.searchBinaryRecursive(root, 7));  // Output: true
        System.out.println("Is 30 present? " + bstSearch.searchBinaryRecursive(root, 30)); // Output: false

        // Search for elements using iterative approach
        System.out.println("Search (Iterative):");
        System.out.println("Is 7 present? " + bstSearch.searchBinaryIterative(root, 7));  // Output: true
        System.out.println("Is 30 present? " + bstSearch.searchBinaryIterative(root, 30)); // Output: false
    }

    /**
     * Perform an in-order traversal of the BST.
     */
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }
}
