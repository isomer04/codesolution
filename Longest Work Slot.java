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
     * Complete the 'findLongestSingleSlot' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts 2D_INTEGER_ARRAY leaveTimes as parameter.
     */

    public static char findLongestSingleSlot(List<List<Integer>> leaveTimes) {
    // Write your code here
    
        int longestShift = 0;
            int currentShiftStart = 0;
            char nurseWithLongestShift = 'a';

            for (List<Integer> nurse : leaveTimes) {
                int shiftLength = nurse.get(1) - currentShiftStart;

                if (shiftLength > longestShift) {
                    longestShift = shiftLength;
                    nurseWithLongestShift = (char) ('a' + nurse.get(0));
                }

                currentShiftStart = nurse.get(1);
            }

        return nurseWithLongestShift;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int leaveTimesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int leaveTimesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> leaveTimes = new ArrayList<>();

        IntStream.range(0, leaveTimesRows).forEach(i -> {
            try {
                leaveTimes.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        char result = Result.findLongestSingleSlot(leaveTimes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
