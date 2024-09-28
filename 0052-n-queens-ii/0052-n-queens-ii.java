class Solution {
    public int totalNQueens(int n) {
        boolean[] rowf = new boolean[n];
        boolean[] colf = new boolean[n];
        boolean[] trblf = new boolean[2*n-1];
        boolean[] tlbrf = new boolean[2*n-1];
        boolean[][] board = new boolean[n][n];

        return solve(rowf, colf, trblf, tlbrf, board, n, 0);
    }

    public int solve(boolean[] rowf, boolean[] colf, boolean[] trblf, 
    boolean[] tlbrf, boolean[][] board, int n, int row) {
        if (row == n) {
            return 1; // Found a valid solution, return 1 to count it
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isvalid(rowf, colf, trblf, tlbrf, board, n, row, col)) {
                rowf[row] = true;
                colf[col] = true;
                trblf[row + col] = true;
                tlbrf[n - 1 - (row - col)] = true;
                board[row][col] = true;

                // Recursively solve for the next row
                count += solve(rowf, colf, trblf, tlbrf, board, n, row + 1);

                // Backtrack
                rowf[row] = false;
                colf[col] = false;
                trblf[row + col] = false;
                tlbrf[n - 1 - (row - col)] = false;
                board[row][col] = false;
            }
        }

        return count;
    }

    boolean isvalid(boolean[] rowf, boolean[] colf, boolean[] trblf, 
    boolean[] tlbrf, boolean[][] board, int n, int row, int col) {
        return !(rowf[row] || colf[col] || trblf[row + col] || tlbrf[n - 1 - (row - col)]);
    }
}
