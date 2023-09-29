package Leetcode.CodePa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public String destCity(List<List<String>> paths) {
        // Create hashsets
        Set<String> cities = new HashSet<>(); 

        // Iterate through the paths
        for (List<String> path : paths) {
            cities.add(path.get(0)); 
        }
        
        // Check each end-city against the start-cities
        for (List<String> path : paths) {
            String dest = path.get(1); 

            // If we do not see the end-city in the start-cities, then we found the destination city and return
            if (!cities.contains(dest)) {
                return dest; 
            }
        }
        return "";
    }
}
