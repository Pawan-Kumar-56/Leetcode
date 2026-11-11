class Solution {
    int ans=0;
    public int orangesRotting(int[][] grid) {
        int[][] directions={
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length;
        int fresh=0;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                int[] node=q.poll();
                int r=node[0];
                int c=node[1];
                for(int[] dir:directions){
                    int nr=r+dir[0];
                    int nc=c+dir[1];
                    if(nr>=0 && nc>-1 && nr<grid.length && nc<m){
                        if(grid[nr][nc]==1){
                            grid[nr][nc]=2;
                            q.add(new int[]{nr,nc});
                            flag=true;
                            fresh--;
                            
                        }
                    }
                    
                }
                
            }
            if(flag) ans++;
        }
        if(fresh>0) return -1;
        return ans;
    }
}