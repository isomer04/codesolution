package Leetcode.topQuestions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(null);


        if(root != null){
            q.offer(root);
        }

        int levelNumber = 1; //Initialize a variable to keep track of the level number
        
        while(!q.isEmpty()){
            int levelSize =  q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i< levelSize; i++){
                TreeNode node = q.poll();
                level.add(node.val);

                if(node.left != null){
                    q.offer(node.left);
                } 

                if(node.right != null){
                    q.offer(node.right);
                }
            }

            if(levelNumber % 2 == 0){
                Collections.reverse(level);
            }

            res.add(level);
            levelNumber++;
        }

        return null;
        
    }
}
