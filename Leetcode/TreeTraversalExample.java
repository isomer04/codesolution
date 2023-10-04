package Leetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeTraversalExample {

    // Pre-Order Traversal: Root -> Left -> Right
    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // Process the current node
            preOrderTraversal(root.left);     // Recur on left subtree
            preOrderTraversal(root.right);    // Recur on right subtree
        }
    }

    // In-Order Traversal: Left -> Root -> Right
    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);      // Recur on left subtree
            System.out.print(root.val + " "); // Process the current node
            inOrderTraversal(root.right);     // Recur on right subtree
        }
    }

    // Post-Order Traversal: Left -> Right -> Root
    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);    // Recur on left subtree
            postOrderTraversal(root.right);   // Recur on right subtree
            System.out.print(root.val + " "); // Process the current node
        }
    }

    // Level-Order Traversal using Queue
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " "); // Process the current node

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

    public static void main(String[] args) {
        // Create a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Pre-Order Traversal:");
        preOrderTraversal(root);
        System.out.println();

        System.out.println("In-Order Traversal:");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        postOrderTraversal(root);
        System.out.println();

        System.out.println("Level-Order Traversal:");
        levelOrderTraversal(root);
    }
}

