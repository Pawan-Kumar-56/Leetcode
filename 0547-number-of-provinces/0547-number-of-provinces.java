class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int m=isConnected[0].length;
        int ans=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
            }
            dfs(i,visited,isConnected);
        }
        return ans;

    }
    public void dfs(int node,boolean[] visited,int[][] isConnected){
        int n=isConnected.length;
        visited[node]=true;
        for(int i=0;i<n;i++){
            if(isConnected[node][i]==1 && i!=node){
                if(visited[i]==false){
                    dfs(i,visited,isConnected);
                }
            }
        }
    }
}