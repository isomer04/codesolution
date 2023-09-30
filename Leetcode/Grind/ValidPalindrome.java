package Leetcode.Grind;

class Solution {
    public boolean isPalindrome(String s) {
        int back = s.length()-1;
        int front = 0;
        
        s = s.toUpperCase();
        
        while (front < back){
            while (!Character.isLetterOrDigit(s.charAt(front)) && front < back){
                front++;
            }
            while (!Character.isLetterOrDigit(s.charAt(back)) && back > front){
                back--;
            }
            if (s.charAt(front) != s.charAt(back)){
                return false;
            }
            back--;
            front++;
        }
        return true;
    }
}

// T: O(n)
// S: O(1)