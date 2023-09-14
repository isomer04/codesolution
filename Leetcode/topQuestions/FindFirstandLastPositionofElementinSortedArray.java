package Leetcode.topQuestions;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    private int findFirst(int[] nums, int target) {
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target)
                idx = mid;
        }
        return idx;
    }

    private int findLast(int[] nums, int target) {
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target)
                idx = mid;
        }
        return idx;
    }

}

// This code is a Java implementation of finding the first and last occurrences
// of a target element in a sorted array using a modified binary search
// algorithm. Let's walk through the code step by step with the given input nums
// = [5,7,7,8,8,10] and target = 8:

// Initialization:

// Two methods, findFirst and findLast, are defined within the Solution class.
// The searchRange method initializes an array result of size 2 to store the
// first and last occurrence indices.
// findFirst Method:

// findFirst is responsible for finding the index of the first occurrence of the
// target in the sorted array.
// It initializes result to -1, low to 0, and high to the last index of the
// array (nums.length - 1).
// Binary Search (findFirst):

// It enters a while loop as long as low is less than or equal to high,
// indicating a valid search space.
// Inside the loop, it calculates the middle index mid using a modified binary
// search formula to avoid integer overflow.
// It compares nums[mid] with the target:
// If nums[mid] is less than the target, it means the target must be on the
// right side of mid, so it updates low to mid + 1.
// If nums[mid] is greater than the target, it means the target must be on the
// left side of mid, so it updates high to mid - 1.
// If nums[mid] is equal to the target, it updates result to mid because it
// found a potential first occurrence of the target and narrows the search space
// by updating high to mid - 1.
// Binary Search (findLast):

// findLast follows a similar structure but searches for the last occurrence of
// the target.
// It initializes result to -1, low to 0, and high to the last index of the
// array.
// Binary Search (Continued):

// Inside the loop, it calculates the middle index mid and compares nums[mid]
// with the target.
// If nums[mid] is less than the target, it updates low to mid + 1.
// If nums[mid] is greater than the target, it updates high to mid - 1.
// If nums[mid] is equal to the target, it updates result to mid because it
// found a potential last occurrence of the target and narrows the search space
// by updating low to mid + 1.
// Result:

// The result array now contains the indices of the first and last occurrences
// of the target in the array.
// For the given input nums = [5,7,7,8,8,10] and target = 8, the code will
// return [3, 4], indicating that the first occurrence of 8 is at index 3, and
// the last occurrence is at index 4 in the array.
