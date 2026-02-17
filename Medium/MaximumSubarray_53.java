class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Add current element to our running sum
            currentSum += nums[i];
            
            // Update maxSum if currentSum is better
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            // If currentSum becomes negative, it's useless for future subarrays
            // So we reset it to 0 (effectively starting a new subarray at the next index)
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}
