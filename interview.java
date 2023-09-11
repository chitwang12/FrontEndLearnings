import java.io.*;
import java.util.*;

class Solution {

    static int findBusiestPeriod(int[][] data) {
        int maxVisitors = 0;        // Initialize the maximum visitor count.
        int currentVisitors = 0;    // Initialize the current visitor count.
        int busiestTime = 0;        // Initialize the timestamp of the busiest time.

        for (int i = 0; i < data.length; i++) {
            int timestamp = data[i][0];
            int count = data[i][1];
            int direction = data[i][2];

            // Update the current visitor count based on entry (1) or exit (0).
            if (direction == 1) {
                currentVisitors += count;
            } else {
                currentVisitors -= count;
            }

            // Check if the next data point has the same timestamp.
            if (i < data.length - 1 && data[i + 1][0] == timestamp) {
                continue;
            }
   
            // Update the busiestTime if the current count is greater than maxVisitors.
            if (currentVisitors > maxVisitors) {
                maxVisitors = currentVisitors;
                busiestTime = timestamp;
            }
        }

        return busiestTime;
    }

    public static void main(String[] args) {
        int[][] data = {
            {1487799425, 14, 1},
            {1487799425, 4, 0},
            {1487799425, 2, 0},
            {1487800378, 10, 1},
            {1487801478, 18, 0},
            {1487801478, 18, 1},
            {1487901013, 1, 0},
            {1487901211, 7, 1},
            {1487901211, 7, 0}
        };

        int result = findBusiestPeriod(data);
        System.out.println(result);  // Output: 1487800378
    }
}
