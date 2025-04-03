class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] result = new int[r][c];

        // Step 1: Copy original matrix into result
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        // Step 2: Find zeros and mark corresponding rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    solve(result, i, j); // Modify result matrix
                }
            }
        }

        // Step 3: Copy result back to matrix (modifies in-place)
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }

    public void solve(int[][] result, int row, int col) {
        int r = result.length;
        int c = result[0].length;

        // Set entire column to 0
        for (int i = 0; i < r; i++) {
            result[i][col] = 0;
        }
        // Set entire row to 0
        for (int j = 0; j < c; j++) {
            result[row][j] = 0;
        }
    }
}
