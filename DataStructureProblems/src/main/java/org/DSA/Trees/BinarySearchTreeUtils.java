package org.DSA.Trees;

public class BinarySearchTreeUtils {

    Node root; // Root of the binary tree

    public BinarySearchTreeUtils() {
        root = null;
    }

    // Insert a new node into the binary Search tree
    public Node insert(Node root, int value) {
        if (root == null) {  // If the tree is empty, return a new node
            root = new Node(value);
            return root;
        }

        if (value < root.value) { // Otherwise, recur down the tree
            root.left = insert(root.left, value); // Insert in left subtree
        } else if (value > root.value) {
            root.right = insert(root.right, value); // Insert in right subtree
        }

        return root; // return the (unchanged) node pointer
    }

    // Search for a node with the given value in the BST
    public static boolean search(Node root, int value) {
        if (root == null) return false; // Base case: root is null, value not found

        if (root.value == value) {
            return true;
        } else if (value < root.value) {
            return search(root.left, value);// Search in left subtree
        } else {
            return search(root.right, value); // Search in right subtree
        }
    }

    // Find the minimum value node in the BST
    public static Node findMin(Node root) {
        if (root == null || root.left == null) {
            return root; // If the left child is null, the current node is the minimum
        }
        return findMin(root.left);// Recur down to find the minimum
    }

    // Find the maximum value node in the BST
    public static Node findMax(Node root) {
        if (root == null || root.right == null) {
            return root;  // If the right child is null, the current node is the maximum
        }
        return findMax(root.right); // Recur down to find the maximum
    }

    // Delete a node with a given value from the BST
    public static Node delete(Node root, int value) {
        if (root == null) return root; // Base case: if the tree is empty

        if (value < root.value) {
            root.left = delete(root.left, value); // Go to the left subtree
        } else if (value > root.value) {
            root.right = delete(root.right, value); // Go to the right subtree
        } else {
            // Node with the value found, now handle the deletion

            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node has one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node has two children, get the inorder successor (smallest in the right subtree)
            Node minNode = findMin(root.right); // Find the minimum node in the right subtree
            root.value = minNode.value; // Replace root's value with the inorder successor's value
            root.right = delete(root.right, minNode.value); // Delete the inorder successor node
        }

        return root;
    }

    // Get the height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0; // Base case: height of empty tree is 0
        }
        // The height of a tree is 1 + the maximum of the heights of the left and right subtrees
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int size(Node root) { // Method to find the size of the binary tree (i.e., number of nodes)
        if (root == null) return 0; // If the node is null, return 0
        return 1 + size(root.left) + size(root.right); // Recur to left and right subtrees and sum up the result
    }

    public void preOrderTraversal(Node root) {  // Pre-order traversal (Root, Left, Right)
        if (root != null) {
            System.out.print(root.value + " "); // Print node value
            preOrderTraversal(root.left);  // Traverse left subtree
            preOrderTraversal(root.right); // Traverse right subtree
        }
    }

    public void inOrderTraversal(Node root) {  // In-order traversal (Left, Root, Right)
        if (root != null) {
            inOrderTraversal(root.left);  // Traverse left subtree
            System.out.print(root.value + " "); // Print node value
            inOrderTraversal(root.right); // Traverse right subtree
        }
    }

    public void postOrderTraversal(Node root) {
        if (root != null) {
            preOrderTraversal(root.left); // Traverse left subtree
            preOrderTraversal(root.right); // Traverse right subtree
            System.out.print(root.value + " "); // Print node value
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeUtils tree = new BinarySearchTreeUtils();

        // Insert elements into the binary tree
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Perform Pre-order traversal
        System.out.print("Pre-order Traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        // Perform In-order traversal
        System.out.print("In-order Traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // Perform Post-order traversal
        System.out.print("Post-order Traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        // Find the size of the binary tree
        int treeSize = tree.size(tree.root);
        System.out.println("Size of the binary tree: " + treeSize); // Output: 7
    }
}
