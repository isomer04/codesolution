package Leetcode.topQuestions;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n){
        while( n >= 3){
            if(n % 3 != 0)
            return false;

            n /= 3;
        }

        return n ==1;
    }

    public static void main(String[] args) {
        int n1 = 27;
        int n2 =  9;
        int n3  = 45;

        boolean result1 = isPowerOfThree(n1);
        boolean result2 = isPowerOfThree(n2);
        boolean result3 = isPowerOfThree(n3);

        System.out.println("Is " + n1 + " a power of three? " + result1);
        System.out.println("Is " + n2 + " a power of three? " + result2);
        System.out.println("Is " + n3 + " a power of three? " + result3);

    }
    
}
