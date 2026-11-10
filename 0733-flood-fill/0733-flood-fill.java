class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] directions={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        int check = image[sr][sc];
        if (check == color) return image;
        dfs(sr,sc,image,directions,color,image[sr][sc]);
        return image;
    }
    public void dfs(int i,int j,int[][] grid,int[][] direction,int color,int check){
        grid[i][j]=color;
        for(int[] dr:direction){
            int nr=i+dr[0];
            int nc=j+dr[1];
            if(nc>=0 && nr>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==check){
                dfs(nr,nc,grid,direction,color,check);
            }
        }
    }
}