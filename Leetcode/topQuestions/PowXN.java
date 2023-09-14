package Leetcode.topQuestions;
class Solution {
    public double myPow(double x, int n) {
        
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }
}


// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0) {
//             return 1.0;
//         }
        
//         if (n < 0) {
//             x = 1 / x;
//             // Handle the case when n is Integer.MIN_VALUE
//             return (n == Integer.MIN_VALUE) ? (x * myPow(x, -(n + 1))) : myPow(x, -n);
//         }
        
//         double result = 1.0;
//         double currentProduct = x;
        
//         while (n > 0) {
//             if (n % 2 == 1) {
//                 result *= currentProduct;
//             }
//             currentProduct *= currentProduct;
//             n /= 2;
//         }
        
//         return result;
//     }


// }
