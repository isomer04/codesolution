package Leetcode.Grind;

class Solution {
    public boolean canConstruct(String ransomeNote, String magazine){
        if(ransomeNote.length() > magazine.length()) return false;

        int[] alphabets_counter = new int[26];

        for(char c : magazine.toCharArray())
            alphabets_counter[c - 'a']++;

        for(char c : ransomeNote.toCharArray()){
            if(alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }

        return true;
    }
}
