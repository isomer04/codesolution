package Leetcode.Grind;

import java.util.Arrays;

class MeetingScheduler {

    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;
        int end = 1;

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][end] > intervals[i + 1][start]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        boolean canAttend = canAttendMeetings(intervals);
        System.out.println("Can attend meetings: " + canAttend);
    }
}
