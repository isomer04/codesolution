package Leetcode.topQuestions;

public class SqureRoot {
    public static int mySqrt(int x) {
        long r = x;

        while(r*r > x){
            r = (r + r/x) /2 ;
        }

        return (int) r;
    }

        public static void main(String[] args) {
            Solution solution = new Solution();
            
            int x1 = 4;
            int sqrt1 = mySqrt(x1);
            System.out.println("Square root of " + x1 + " is: " + sqrt1);
            
         
        }
    
    

}
