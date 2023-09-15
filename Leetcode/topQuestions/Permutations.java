package Leetcode.topQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        
        permuteHelper(nums, new ArrayList<>(), result);
        return result;

        
    }

    private void permuteHelper(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result){
        if(currentPermutation.size() == nums.length){
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for(int i= 0; i< nums.length; i++){
            if(!currentPermutation.contains(nums[i])){
                currentPermutation.add(nums[i]);
                permuteHelper(nums, currentPermutation, result);
                currentPermutation.remove(currentPermutation.size() -1 );
            }
        }
    }

    
}

// Python


