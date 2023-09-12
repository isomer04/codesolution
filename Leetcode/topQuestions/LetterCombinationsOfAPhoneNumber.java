package Leetcode.topQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> answer = new LinkedList<String>();

        if(digits.isEmpty()) return answer;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        answer.add("");

        for(int i= 0; i< digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(answer.peek().length() == i){
                String t = answer.remove();
                for(char s: mapping[x].toCharArray())
                    answer.add(t+s);
            }
        }

        return answer;
        
    }
}
