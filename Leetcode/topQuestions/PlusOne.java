package Leetcode.topQuestions;

class PlusOne {
    public static void main(String[] args) {
     int[] digits = {2, 2, 9}; // Example input
     int[] result = plusOne(digits);
     
     // Print the result
     for (int digit : result) {
         System.out.print(digit + " ");
     }
   }
   
   public static int[] plusOne(int[] digits) {
     int n = digits.length;
     
     // Iterate through the digits in reverse order
     for (int i = n - 1; i >= 0; i--) {
         // If the current digit is less than 9, we can simply increment it and return
         if (digits[i] < 9) {
             digits[i]++;
             return digits;
         }
         
         // If the current digit is 9, set it to 0 and continue to the next digit
         digits[i] = 0;
     }
     
     // If we reach here, it means we have a carry, so we need to create a new array
     int[] newNumber = new int[n + 1];
     newNumber[0] = 1; // Set the first digit to 1
     
     return newNumber;
 }
 
 
 } 
    

