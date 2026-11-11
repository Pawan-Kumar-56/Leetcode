class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int[][] direction={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(board[i][j]=='O'){
                        dfs(i,j,board,direction);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='W'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(int i,int j,char[][] arr,int[][] direction){
        arr[i][j]='W';
        for(int[] dir:direction){
            int nr=i+dir[0];
            int nc=j+dir[1];
            if(nr>=0 && nc>=0 && nr<arr.length && nc<arr[0].length){
                if(arr[nr][nc]=='O'){
                    dfs(nr,nc,arr,direction);
                }
            }
        }
    }
}