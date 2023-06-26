/* Guess Number Higher or Lower

We are playing the Guess Game. The game is as follows:

I pick a number from1ton. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined APIint guess(int num), which returns three possible results:


-1: Your guess is higher than the number I picked (i.e.num > pick).

1: Your guess is lower than the number I picked (i.e.num < pick).

0: your guess is equal to the number I picked (i.e.num == pick).

Returnthe number that I picked.

Note:

1 <= n <= 231 - 1
1 <= pick <= n

Examples:

Input: n = 10, pick = 6
Output: 6

Input: n = 1, pick = 1
Output: 1

Input: n = 2, pick = 1
Output: 1

*/

class Result {
    
    public static int guess(int myGuess, int pick) {
        if (myGuess == pick) {
            return 0;
        }
        else if (myGuess > pick) {
            return -1;
        }
        else {
            return 1;
        }
    }
    
    public static int guessNumber(int n, int pick) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid, pick);

            if (result == 0) {
                return mid; 
            } else if (result < 0) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }

        return -1; 
    }

}
