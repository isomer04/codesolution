package Leetcode.topQuestions;

class Solution {
    public int divide(int dividend, int divisor){

        // Reduce the problem to positive long integer to take make it easier
        //Use long to avoid integer overflow cases.
        int sign = 1;

        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
            sign =-1;

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        //Take care the edge cases.
        if(ldivisor == 0) return Integer.MAX_VALUE;
        if((ldividend == 0) || (ldividend < ldivisor)) return 0;

        long lans = ldivide(ldividend, ldivisor);

        int answer;

        if(lans > Integer.MAX_VALUE) {
            answer =  (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            answer = (int) (sign * lans);
        }

        return answer;


    }

    private long ldivide(long ldividend, long ldivisor){
        if(ldividend < ldivisor) return 0;

        //think this as a binary search
        long sum = ldivisor;
        long  multiple = 1;
        while((sum + sum) <= ldividend){
            sum +=sum;
            multiple += multiple;
        }

        return multiple + ldivide(ldividend - sum, ldivisor);
    }
}