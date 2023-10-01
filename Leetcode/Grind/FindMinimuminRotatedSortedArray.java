package Leetcode.Grind;

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            final int middle = (left + right) / 2;

            if (nums[middle] < nums[right]) {

                right = middle;
            } else {
                left = middle + 1;
            }

        }
        return nums[right];
    }
}
