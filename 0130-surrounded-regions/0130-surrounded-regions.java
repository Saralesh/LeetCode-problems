class Solution {
    static int r;
    static int c;    
    public void solve(char[][] board) {
        r = board.length;
        c = board[0].length;
        for(int i = 0;i < r;i++){
            if(board[i][0] == 'O')   dfs(board,i,0);
            if(board[i][c-1] == 'O')  dfs(board,i,c-1); 
        }
        for(int j = 0;j < c;j++){
            if(board[0][j] == 'O')   dfs(board,0,j);
            if(board[r-1][j] == 'O')  dfs(board,r-1,j);
        }
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == 'T') board[i][j] = 'O';
                }
            }
        }
    
    public static void dfs(char[][] board,int i,int j){
        if(i >= r || i < 0 || j >= c || j < 0 || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'T';
        dfs(board,i-1,j);
        dfs(board,i+1,j);
        dfs(board,i,j-1);
        dfs(board,i,j+1);
    }
}