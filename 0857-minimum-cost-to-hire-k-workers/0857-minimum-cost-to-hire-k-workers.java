import java.util.*;

class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;

        Integer[] workers = new Integer[n];

        for (int i = 0; i < n; i++) {
            workers[i] = i;
        }

        Arrays.sort(workers, (a, b) ->
            Double.compare(
                (double) wage[a] / quality[a],
                (double) wage[b] / quality[b]
            )
        );

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int qualitySum = 0;
        double answer = Double.MAX_VALUE;

        for (int i : workers) {
            pq.offer(quality[i]);
            qualitySum += quality[i];

            if (pq.size() > k) {
                qualitySum -= pq.poll();
            }

            if (pq.size() == k) {
                double ratio = (double) wage[i] / quality[i];
                answer = Math.min(answer, qualitySum * ratio);
            }
        }

        return answer;
    }
}