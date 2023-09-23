package Leetcode.topQuestions;

public class ClimbingStars {

        public static void main(String[] args) {
    
            int n =5  ; // You can change this value to test with different input values
    
            int waysToClimb = climbStairs(n);
    
            System.out.println("Number of ways to climb " + n + " stairs: " + waysToClimb);
        }

        public static int climbStairs(int n) {
            if( n == 0 ||  n ==1){
                return 1;
            }
    
            return climbStairs(n -1) + climbStairs( n- 2);
        }
    
    
    
}
