package Leetcode.Grind;

import javax.swing.tree.TreeNode;

class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;

        return root;
    }    
}
