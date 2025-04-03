class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    solve(result, i, j);
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    public void solve(int[][] result, int row, int col) {
        int r = result.length;
        int c = result[0].length;

        for (int i = 0; i < r; i++) {
            result[i][col] = 0;
        }
        for (int j = 0; j < c; j++) {
            result[row][j] = 0;
        }
    }
}
