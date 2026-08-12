class Solution {
    public double minimumAverage(int[] nums) {
        // Sort the array to easily pick min and max elements
        Arrays.sort(nums);
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;

        // Use two pointers: i from start (min), j from end (max)
        for (int i = 0; i < n / 2; i++) {
            double currentAvg = (nums[i] + nums[n - 1 - i]) / 2.0;
            
            // Update the minimum average found so far
            if (currentAvg < minAvg) {
                minAvg = currentAvg;
            }
        }

        return minAvg;
    }
}
