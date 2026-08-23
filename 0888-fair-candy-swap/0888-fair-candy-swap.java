import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int candy : aliceSizes) {
            aliceTotal += candy;
        }

        for (int candy : bobSizes) {
            bobTotal += candy;
        }

        int diff = (aliceTotal - bobTotal) / 2;

        Set<Integer> bob = new HashSet<>();

        for (int candy : bobSizes) {
            bob.add(candy);
        }

        for (int candy : aliceSizes) {
            int need = candy - diff;

            if (bob.contains(need)) {
                return new int[]{candy, need};
            }
        }

        return new int[0];
    }
}