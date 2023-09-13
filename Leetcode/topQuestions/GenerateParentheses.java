package Leetcode.topQuestions;

import java.util.ArrayList;
import java.util.List;

import java.util.Stack;

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
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }

    public List<String> generateParenthesis2(int n) {
        List<String> result = new ArrayList<>();
        Stack<ParenthesisInfo> stack = new Stack<>();
        stack.push(new ParenthesisInfo("", 0, 0));

        while (!stack.isEmpty()) {
            ParenthesisInfo info = stack.pop();

            if (info.s.length() == n * 2) {
                result.add(info.s);
            } else {
                if (info.left < n) {
                    stack.push(new ParenthesisInfo(info.s + "(", info.left + 1, info.right));
                }

                if (info.right < info.left) {
                    stack.push(new ParenthesisInfo(info.s + ")", info.left, info.right + 1));
                }
            }
        }

        return result;

    }

    private class ParenthesisInfo {
        String s;
        int left;
        int right;

        ParenthesisInfo(String s, int left, int right) {
            this.s = s;
            this.left = left;
            this.right = right;
        }

    }

}

//
