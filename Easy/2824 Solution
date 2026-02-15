/*
LeetCode 2824 - Count Pairs Whose Sum is Less than Target
Approach: Sorting + Two Pointers
Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.*;

public class CountPairsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
