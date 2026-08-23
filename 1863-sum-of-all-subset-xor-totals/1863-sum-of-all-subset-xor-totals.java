class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        int take = dfs(nums, index + 1, xor ^ nums[index]);
        int skip = dfs(nums, index + 1, xor);

        return take + skip;
    }
}