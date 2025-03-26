class Solution {
    static int r;
    static int c;
    public int numIslands(char[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int count = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(grid[i][j] == '1'){
                count++;
                solve(grid,i,j,count);
                }
            }
        }
        return count;
    }
    public static void solve(char[][] grid,int i,int j,int count){
        if(i >= r || i < 0 || j >= c || j < 0 || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        solve(grid,i,j-1,count);
        solve(grid,i,j+1,count);
        solve(grid,i-1,j,count);
        solve(grid,i+1,j,count);
    }
}