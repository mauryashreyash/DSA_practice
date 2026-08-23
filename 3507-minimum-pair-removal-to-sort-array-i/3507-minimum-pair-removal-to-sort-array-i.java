class Solution {
    public int minimumPairRemoval(int[] nums) {
        int operations = 0;

        while (!isSorted(nums)) {
            int index = 0;
            int minSum = nums[0] + nums[1];

            // Find the leftmost pair with minimum sum
            for (int i = 1; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Replace the pair with their sum
            int[] next = new int[nums.length - 1];

            for (int i = 0, j = 0; i < nums.length; i++) {
                if (i == index) {
                    next[j++] = minSum;
                    i++;
                } else {
                    next[j++] = nums[i];
                }
            }

            nums = next;
            operations++;
        }

        return operations;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}