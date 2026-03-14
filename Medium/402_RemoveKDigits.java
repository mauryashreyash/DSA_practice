import java.util.*;

class Solution {

    public String removeKdigits(String num, int k) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : num.toCharArray()) {

            while (!stack.isEmpty() && k > 0 && stack.peekLast() > c) {
                stack.pollLast();
                k--;
            }

            stack.offerLast(c);
        }

        while (k > 0) {
            stack.pollLast();
            k--;
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pollFirst());
        }

        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
