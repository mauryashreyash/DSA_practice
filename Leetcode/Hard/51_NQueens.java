import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diag = new boolean[2 * n];
        boolean[] antiDiag = new boolean[2 * n];

        backtrack(0, n, board, cols, diag, antiDiag, result);

        return result;
    }

    private void backtrack(int row, int n,
                           char[][] board,
                           boolean[] cols,
                           boolean[] diag,
                           boolean[] antiDiag,
                           List<List<String>> result) {

        if (row == n) {

            List<String> solution = new ArrayList<>();

            for (char[] r : board) {
                solution.add(new String(r));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {

            int d = row - col + n;
            int ad = row + col;

            if (cols[col] || diag[d] || antiDiag[ad]) continue;

            board[row][col] = 'Q';
            cols[col] = diag[d] = antiDiag[ad] = true;

            backtrack(row + 1, n, board, cols, diag, antiDiag, result);

            board[row][col] = '.';
            cols[col] = diag[d] = antiDiag[ad] = false;
        }
    }
}
