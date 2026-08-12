import java.util.*;

class Solution {

    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) return 0;

        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;

        for (char[] row : matrix) {

            for (int i = 0; i < cols; i++) {

                if (row[i] == '1') {
                    heights[i]++;
                } else {
                    heights[i] = 0;
                }
            }

            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int height = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && height < heights[stack.peek()]) {

                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, h * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
