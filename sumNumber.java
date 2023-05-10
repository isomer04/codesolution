// Hirebue
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

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
      
      String[] numbers = line.split(",");
      int[] nums = new int[3];
      for (int i = 0; i < 3; i++) {
        nums[i] = Integer.parseInt(numbers[i]);   
      }
      Arrays.sort(nums);
      int max = nums[2];
      int num1 = nums[0];
      int num2 = nums[1];

      boolean result = (num1 + num2 == max);
      System.out.println(result);
    }
  }
}
