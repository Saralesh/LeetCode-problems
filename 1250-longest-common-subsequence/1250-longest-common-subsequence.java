class Solution {
    public int longestCommonSubsequence(String str1, String str2) {
       int l1 = str1.length()+1;
        int l2 = str2.length()+1;
        int[][] dp = new int[l1][l2];
        for(int i = 1;i < l1;i++){
            for(int j = 1;j<l2;j++){

                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }



            } 
        }
        return dp[l1 - 1][l2 -1];
    }
}