//Hire
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      String longestWord = "";
      String[] words = line.split(" ");
      
       for (int i = 0; i < words.length; i++) {
        String word = words[i];
        
        if (word.length() > longestWord.length()) {
          longestWord = word;
        }
      }
      
      System.out.println(longestWord);    
    }
  }
}
