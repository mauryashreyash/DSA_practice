class Solution {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);

        // Maximum possible number of digits in base 2
        for (int digits = 60; digits >= 2; digits--) {
            long low = 2;
            long high = (long) Math.pow(num, 1.0 / (digits - 1));

            while (low <= high) {
                long base = low + (high - low) / 2;

                if (isGood(num, base, digits)) {
                    return String.valueOf(base);
                }

                long sum = 1;
                long power = 1;

                for (int i = 1; i < digits; i++) {
                    if (power > (num - 1) / base) {
                        sum = num + 1;
                        break;
                    }

                    power *= base;
                    sum += power;

                    if (sum > num) {
                        break;
                    }
                }

                if (sum < num) {
                    low = base + 1;
                } else {
                    high = base - 1;
                }
            }
        }

        // Always works with n - 1: n = (n - 1) + 1
        return String.valueOf(num - 1);
    }

    private boolean isGood(long num, long base, int digits) {
        long sum = 1;
        long power = 1;

        for (int i = 1; i < digits; i++) {
            if (power > (num - 1) / base) {
                return false;
            }

            power *= base;
            sum += power;

            if (sum > num) {
                return false;
            }
        }

        return sum == num;
    }
}