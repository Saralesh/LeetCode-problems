class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1 && col == 1) return 1;
        int max = 0;
        int[][] dp = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                    dfs(i,j,matrix,dp,-1);
                    max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    public int dfs(int i,int j,int[][] matrix,int[][] dp,int prevValue){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length || matrix[i][j] <= prevValue){
            return 0;
        }
        if(dp[i][j] != 0) return dp[i][j];
        int up = dfs(i-1,j,matrix,dp,matrix[i][j]);
        int down = dfs(i+1,j,matrix,dp,matrix[i][j]);
        int left = dfs(i,j-1,matrix,dp,matrix[i][j]);
        int right = dfs(i,j+1,matrix,dp,matrix[i][j]);
        dp[i][j] = 1 + Math.max(Math.max(up,down),Math.max(left,right));
        return dp[i][j];
    }
}