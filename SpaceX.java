

public class SpaceX {
    
}


// Longest Palindromic Substring. Given a string, find the longest substring that is a palindrome. A palindrome is a string that reads the same backward as forward.

public String longestPalindrome(String s) {
  int n = s.length();
  boolean[][] dp = new boolean[n][n];
  for (int i = 0; i < n; i++) {
    dp[i][i] = true;
  }

  for (int cl = 2; cl <= n; cl++) {
    for (int i = 0; i < n - cl + 1; i++) {
      int j = i + cl - 1;
      if (s.charAt(i) == s.charAt(j) && (cl == 2 || dp[i + 1][j - 1])) {
        dp[i][j] = true;
      }
    }
  }

  int start = 0, end = 0;
  for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
      if (dp[i][j] && j - i > end - start) {
        start = i;
        end = j;
      }
    }
  }

  return s.substring(start, end + 1);
}
// Use code with caution. Learn more
// Reverse Words in a String. Given a string, reverse the order of the words in the string. A word is defined as a sequence of non-space characters.
// Java
public String reverseWords(String s) {
  String[] words = s.split(" ");
  String reversed_words = "";
  for (int i = words.length - 1; i >= 0; i--) {
    reversed_words += words[i] + " ";
  }

  return reversed_words.trim();
}
// Use code with caution. Learn more
// Valid Palindrome. Given a string, determine if it is a palindrome. A palindrome is a string that reads the same backward as forward.
// Java


public boolean validPalindrome(String s) {
  int n = s.length();
  for (int i = 0; i < n // 2; i++) {
    if (s.charAt(i) != s.charAt(n - i - 1)) {
      return false;
    }
  }

  return true;
}
// Use code with caution. Learn more
// String Compression. Given a string, compress it by replacing repeated characters with the character and the number of times it appears. For example, the string "aabcccccaaa" would be compressed to "a2b1c5a3".
// Java



public String stringCompression(String s) {
  int n = s.length();
  String compressed_string = "";
  int count = 1;
  for (int i = 1; i < n; i++) {
    if (s.charAt(i) == s.charAt(i - 1)) {
      count++;
    } else {
      if (count > 1) {
        compressed_string += count;
      }
      compressed_string += s.charAt(i - 1);
      count = 1;
    }
  }

  if (count > 1) {
    compressed_string += count;
  }

  return compressed_string;
}