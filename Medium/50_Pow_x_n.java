/**
 * LeetCode 50: Pow(x, n)
 *
 * Problem:
 * Implement pow(x, n), which calculates x raised to the power n.
 *
 * Approach:
 * Binary Exponentiation (Fast Power)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public double myPow(double x, int n) {
        long power = n;   // handle edge case of Integer.MIN_VALUE
        
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>= 1;
        }

        return result;
    }
}
