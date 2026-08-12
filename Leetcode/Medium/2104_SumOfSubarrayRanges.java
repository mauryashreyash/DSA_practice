import java.util.*;

class Solution {

    public long subArrayRanges(int[] nums) {

        return sumSubarrayMax(nums) - sumSubarrayMin(nums);
    }

    private long sumSubarrayMin(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() &&
                  (i == n || nums[stack.peek()] > nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? mid + 1 : mid - stack.peek();
                int right = i - mid;

                sum += (long) nums[mid] * left * right;
            }

            stack.push(i);
        }

        return sum;
    }

    private long sumSubarrayMax(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() &&
                  (i == n || nums[stack.peek()] < nums[i])) {

                int mid = stack.pop();

                int left = stack.isEmpty() ? mid + 1 : mid - stack.peek();
                int right = i - mid;

                sum += (long) nums[mid] * left * right;
            }

            stack.push(i);
        }

        return sum;
    }
}
