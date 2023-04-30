import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<Integer> numbers) {
            // Sort the input array
    Collections.sort(numbers);

    // Find the minimum absolute difference between adjacent elements
    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.size() - 1; i++) {
        int diff = Math.abs(numbers.get(i) - numbers.get(i+1));
        if (diff < minDiff) {
            minDiff = diff;
        }
    }

    // Iterate through the array again and print all pairs with the minimum absolute difference
    for (int i = 0; i < numbers.size() - 1; i++) {
        int diff = Math.abs(numbers.get(i) - numbers.get(i+1));
        if (diff == minDiff) {
            System.out.println(numbers.get(i) + " " + numbers.get(i+1));
        }
    }
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        Result.closestNumbers(numbers);

        bufferedReader.close();
    }
}
