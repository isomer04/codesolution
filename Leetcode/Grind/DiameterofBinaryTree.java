package Leetcode.Grind;

import javax.swing.tree.TreeNode;

class Solution {
    int max;

    public int getDiameter(TreeNode root)
    {
        int height = 0;
        if(root == null) return 0;

        int left = getDiameter(root.left);
        int right = getDiameter(root.right);


        height = Math.max(left, right);
        max = Math.max(max, left + right + 1);

        height = height + 1;

        return height;

    }

    public int DiameterofBinaryTree ( TreeNode root) {
        max = Integer.MIN_VALUE;

        getDiameter(root);

        return max-1;
    }
}
