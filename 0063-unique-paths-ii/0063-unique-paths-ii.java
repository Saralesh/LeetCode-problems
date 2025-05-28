class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid[0][0] == 1){
            return 0;
        }
        int r = obstacleGrid.length;
        int c = obstacleGrid[0].length;
        int[] dp = new int[c];
        dp[0] = 1;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(obstacleGrid[i][j] == 1){
                    dp[j] = 0;
                }
                else{
                    if(j > 0){
                        dp[j] += dp[j-1];
                    }
                }
            }
        }
        return dp[c-1];
    }
}