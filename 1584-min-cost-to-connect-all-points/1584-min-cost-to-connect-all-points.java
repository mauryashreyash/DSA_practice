class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] minDist = new int[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }

        minDist[0] = 0;
        int totalCost = 0;

        for (int i = 0; i < n; i++) {
            int curr = -1;

            // Find the closest unconnected point
            for (int j = 0; j < n; j++) {
                if (!used[j] && (curr == -1 || minDist[j] < minDist[curr])) {
                    curr = j;
                }
            }

            used[curr] = true;
            totalCost += minDist[curr];

            // Update distances from the newly connected point
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    int distance = Math.abs(points[curr][0] - points[j][0])
                                 + Math.abs(points[curr][1] - points[j][1]);

                    minDist[j] = Math.min(minDist[j], distance);
                }
            }
        }

        return totalCost;
    }
}