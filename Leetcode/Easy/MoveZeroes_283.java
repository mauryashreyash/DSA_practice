class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the last known non-zero position
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                
                lastNonZeroIndex++;
            }
        }
    }
}
