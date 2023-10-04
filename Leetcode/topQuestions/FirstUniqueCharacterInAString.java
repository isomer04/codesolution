import java.util.Arrays;

public class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(freq) + " at i=" + i); // Debug statement
            System.out.println("===================");
             System.out.println(freq[s.charAt(i) - 'a' ] + " freq[s.charAt(i) - 'a']");
        }
        
        for (int i = 0; i < s.length(); i++) {
             
            if (freq[s.charAt(i) - 'a'] == 1) {
               
                
                return i;
            }
        }
        
        System.out.println("No non-repeating characters found"); // Debug statement
        return -1;
    }
}
