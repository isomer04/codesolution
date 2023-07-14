import java.util.List;

public class Main {
    public static int countHighlyProfitableMonths(List<Integer> stockPrices, int k) {
        int n = stockPrices.size();
        int count = 0;
        int start = 0;
        int end = 1;

        while (end < n) {
            if (stockPrices.get(end) > stockPrices.get(end - 1)) {
                // If the stock price is increasing, move to the next month
                end++;
            } else {
                // If the stock price stops increasing, calculate the window size
                int windowSize = end - start;
                // Check if the window size is at least k
                if (windowSize >= k) {
                    // Increment the count by the number of highly profitable intervals in this window
                    count += windowSize - k + 1;
                }
                // Move the start and end pointers to the next potential interval
                start = end;
                end++;
            }
        }

        // Calculate the window size for the last interval
        int windowSize = end - start;
        // Check if the window size is at least k
        if (windowSize >= k) {
            // Increment the count by the number of highly profitable intervals in this window
            count += windowSize - k + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> stockPrices = List.of(5, 3, 5, 7, 8);
        int k = 3;
        int highlyProfitableIntervals = countHighlyProfitableMonths(stockPrices, k);
        System.out.println("Number of highly profitable intervals: " + highlyProfitableIntervals);
    }
}
