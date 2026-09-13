import java.util.*;

class Solution {

    public int[] findEvenNumbers(int[] digits) {

        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {

            // Hundreds digit cannot be 0
            if (digits[i] == 0) {
                continue;
            }

            for (int j = 0; j < digits.length; j++) {

                for (int k = 0; k < digits.length; k++) {

                    // Cannot reuse the same element
                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    // Last digit must be even
                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100
                               + digits[j] * 10
                               + digits[k];

                    numbers.add(number);
                }
            }
        }

        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}