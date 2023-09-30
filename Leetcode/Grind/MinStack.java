package Leetcode.Grind;

import java.util.Stack;

class MinStack {
    Stack<Integer> mins =  new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int val){
        stack.push(val);
        if(mins.empty() || val < mins.peek()) {
            mins.push(val);
        } else {
            mins.push(mins.peek());
        }
    }

    public void pop(){
        stack.pop();
        mins.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return mins.peek();
    }
}
