class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] directions={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid,directions);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,char[][] grid,int[][] direction){
        grid[i][j]='0';
        for(int[] dr:direction){
            int nr=i+dr[0];
            int nc=j+dr[1];
            if(nc>=0 && nr>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1'){
                dfs(nr,nc,grid,direction);
            }
        }
    }
}