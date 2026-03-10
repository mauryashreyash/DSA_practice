import java.util.*;

class Solution {

    public List<String> addOperators(String num, int target) {

        List<String> result = new ArrayList<>();

        backtrack(result, num, target, 0, 0, 0, "");

        return result;
    }

    private void backtrack(List<String> result,
                           String num,
                           int target,
                           int index,
                           long currentValue,
                           long prevNumber,
                           String expression) {

        if (index == num.length()) {

            if (currentValue == target) {
                result.add(expression);
            }

            return;
        }

        for (int i = index; i < num.length(); i++) {

            if (i != index && num.charAt(index) == '0') break;

            long number = Long.parseLong(num.substring(index, i + 1));

            if (index == 0) {

                backtrack(result, num, target,
                        i + 1, number, number,
                        expression + number);

            } else {

                backtrack(result, num, target,
                        i + 1,
                        currentValue + number,
                        number,
                        expression + "+" + number);

                backtrack(result, num, target,
                        i + 1,
                        currentValue - number,
                        -number,
                        expression + "-" + number);

                backtrack(result, num, target,
                        i + 1,
                        currentValue - prevNumber + prevNumber * number,
                        prevNumber * number,
                        expression + "*" + number);
            }
        }
    }
}
