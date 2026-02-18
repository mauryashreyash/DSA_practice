class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length;
        int[] result = new int[n];
        
        int posIndex = 0;  // even index for positive
        int negIndex = 1;  // odd index for negative
        
        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }
        
        return result;
    }
}
