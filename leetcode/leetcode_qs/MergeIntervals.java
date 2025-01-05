package leetcode_qs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        // sort intervals by starting time
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        printIntervals(intervals);

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            int currentStartTime = interval[0];
            int currentEndTime = interval[1];

            if (merged.isEmpty() || merged.getLast()[1] < currentStartTime) {
                merged.add(interval);
            } else {
                // update lastEndTime
                merged.getLast()[1] = Math.max(merged.getLast()[1], currentEndTime);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    private static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            for (int i : interval) System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sorted = {{1, 3}, {8, 10}, {15, 18}, {2, 6}}; // A 2x3 array with specific values

        int[][] merged = merge(sorted);
        printIntervals(merged);
    }
}
