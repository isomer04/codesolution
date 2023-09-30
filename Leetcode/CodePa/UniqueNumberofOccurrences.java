package Leetcode.CodePa;

import java.util.HashMap;
import java.util.HashSet;

class UniqueNumberofOccurrences {
    public boolean UniqueNumberofOccurrences(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i: arr) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> hSet = new HashSet<>(hmap.values());

        return hSet.size() == hmap.size();
    }    
}
