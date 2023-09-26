package Neet;

import java.util.HashSet;
import java.util.Set;

 class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int res = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                while (numSet.contains(num + 1)) {
                    count++;
                    num++;
                }
                res = Math.max(res, count);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {100, 4, 200, 1, 3, 2};
        int longestStreak = solution.longestConsecutive(nums);
        System.out.println("Longest Consecutive Streak: " + longestStreak);
    }
}


/*
 * 
 * 
 * 
 * Explanation:

We define the longestConsecutive function, which takes an integer array nums as input and returns the length of the longest consecutive sequence.

We create a Set<Integer> called numSet to store unique integers from the nums array. This set ensures that each number is counted only once.

We initialize the res variable to 0, which will store the length of the longest consecutive sequence.

We iterate through the numSet using an enhanced for loop. For each number num in the set:

We check if num - 1 is not in the numSet. If this condition is met, it means num is the start of a new consecutive sequence.

We initialize a count variable to 1 and enter a while loop that increments count while num + 1 is in the numSet. This loop calculates the length of the consecutive sequence starting from num.

We update res by taking the maximum of the current res value and the count. This ensures that res always stores the length of the longest consecutive sequence encountered so far.

After iterating through all numbers in numSet, we return the res value, which represents the length of the longest consecutive sequence.

In the main method, we demonstrate how to use the longestConsecutive method by passing an example array and printing the result.

This Java code accurately calculates the length of the longest consecutive sequence in the input array nums. It utilizes a Set to efficiently store unique numbers and a loop to track the consecutive sequence length.
 * 
 */