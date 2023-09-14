package Leetcode.topQuestions;

 class Main {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class

        // Test cases
        int m1 = 3;
        int n1 = 7;
        int result1 = uniquePaths(m1, n1);
        System.out.println("Unique Paths for m=" + m1 + ", n=" + n1 + ": " + result1);

       
    }

        public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }
            
        return (int)res;
    }
}






