package Leetcode.topQuestions;

public class ClimbingStars {

        public static void main(String[] args) {
    
            int n =5  ; // You can change this value to test with different input values
    
            int waysToClimb = climbStairs(n);
    
            System.out.println("Number of ways to climb " + n + " stairs: " + waysToClimb);
        }

        public static int climbStairs(int n) {
            // if( n == 0 ||  n ==1){
            //     return 1;
            // }
    
            // return climbStairs(n -1) + climbStairs( n- 2);

            
                if(n==1) return 1;
                
                if(n==2) return 2;
        
                int[] a =  new int[n];
                a[0]=1;
                a[1]=2;
        
                for(int i=2;i<n;i++){
                    a[i]=a[i-1]+a[i-2];
                }
                return a[n-1];
                
            
        }
    
    
    
}
