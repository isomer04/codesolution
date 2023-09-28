package Leetcode.topQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        int res = 0;

        for(int num: nums){
            numSet.add(num);
        }

        for(int num: numSet){
            if(!numSet.contains(num - 1)){
                int count = 1;
                while(numSet.contains(num + 1)){
                    count++;
                    num++;
                }

                res= Math.max(count, res)
            }
        }

        return res;
    }

}