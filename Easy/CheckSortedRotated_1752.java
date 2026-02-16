class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Check if current element is greater than the next (with modulo for wrap-around)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If more than one "drop" is found, it can't be a rotated sorted array
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
