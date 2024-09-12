class Solution {
    public static void dfs(char[][] grid,int x, int y, int r, int c){
        if(x < 0 || x >= r || y < 0 || y >= c || grid[x][y] == '0' || grid[x][y] == '2'){
            return;
        }
        grid[x][y] = '2';
        dfs(grid,x+1,y,r,c);
        dfs(grid,x,y+1,r,c);
        dfs(grid,x-1,y,r,c);
        dfs(grid,x,y-1,r,c);
    }
    public int numIslands(char[][] grid) {
        
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        if(r == 0) return 0;
       
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == '1'){
                dfs(grid,i,j,r,c);
                count++;
                }
            }
        }
        return count;
        
    }
}