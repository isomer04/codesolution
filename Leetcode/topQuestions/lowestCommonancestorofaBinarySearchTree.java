package Leetcode.topQuestions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while (true) {
            if ( p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            } else if( p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            } else {
                return curr;
            }
            
        }
    }
}