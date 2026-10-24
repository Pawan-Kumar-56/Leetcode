class Solution {
    public int uniquePaths(int m, int n) {
        

        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int prev=1;
        int curr=1;
        for(int i=1;i<m;i++){
            prev=1;
            for(int j=1;j<n;j++){
               curr=prev+dp[j];
               prev=curr;
               dp[j]=curr;
            }
        }
        return curr;





        // int[][] dp=new int[m][n];
        // for(int i=0;i<m;i++) dp[i][0]=1;
        // for(int i=0;i<n;i++) dp[0][i]=1;
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[i][j]=dp[i-1][j]+dp[i][j-1];
        //     }
        // }
        // return dp[m-1][n-1];


        // for(int[] arr:dp) Arrays.fill(arr,-1);
        // return f(m-1,n-1,dp);
    }


    // public int f(int i,int j,int[][] dp){
    //     if(i==0 || j==0) return 1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     return dp[i][j]=f(i-1,j,dp)+f(i,j-1,dp);
    // }
}