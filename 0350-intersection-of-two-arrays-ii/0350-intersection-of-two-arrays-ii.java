import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];

        for (int num : nums1) {
            freq[num]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (freq[num] > 0) {
                result.add(num);
                freq[num]--;
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}