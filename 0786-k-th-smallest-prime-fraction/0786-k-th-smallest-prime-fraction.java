import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                (double) arr[a[0]] / arr[a[1]],
                (double) arr[b[0]] / arr[b[1]]
            )
        );

        // Start with 1 / every other number
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        for (int i = 1; i < k; i++) {
            int[] curr = pq.poll();

            int numerator = curr[0];
            int denominator = curr[1];

            if (numerator + 1 < denominator) {
                pq.offer(new int[]{numerator + 1, denominator});
            }
        }

        int[] answer = pq.peek();

        return new int[]{arr[answer[0]], arr[answer[1]]};
    }
}