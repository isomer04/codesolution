package Neet;

import java.util.ArrayList;
import java.util.List;

 class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        generateSubsets(nums, 0, cur, res);

        return res;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> cur, List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(cur)); // Make a copy of 'cur' to avoid modifying the same list.
            return;
        }

        // Skip the current element.
        generateSubsets(nums, index + 1, cur, res);

        // Include the current element.
        cur.add(nums[index]);
        generateSubsets(nums, index + 1, cur, res);

        // Backtrack by removing the last element.
        cur.remove(cur.size() - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);

        // Print the generated subsets.
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
