package Leetcode.topQuestions;

import java.util.ArrayList;
import java.util.List;

// 			   	(0, 0, '')
					// 			 	    |	
					// 				(1, 0, '(')  
					// 			   /           \
					// 		(2, 0, '((')      (1, 1, '()')
					// 		   /                 \
					// 	(2, 1, '(()')           (2, 1, '()(')
					// 	   /                       \
					// (2, 2, '(())')                (2, 2, '()()')
					// 	      |	                             |
					// res.append('(())')             res.append('()()')
   

public class GenerateParentheses {
    public List<String> GenerateParentheses(int n){
        List< String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, String s, int n){
        if(s.length() == n * 2){
            res.add(s);
            return;
        }

        if(left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if(right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
}
