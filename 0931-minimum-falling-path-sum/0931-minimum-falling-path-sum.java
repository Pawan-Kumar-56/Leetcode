class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        int[] dp=new int[m];
        int[] dp2=new int[m];
        Arrays.fill(dp2,Integer.MAX_VALUE);
        for(int i=0;i<m;i++){
            dp[i]=matrix[0][i];
        }
            for(int i=1;i<n;i++){
                for(int j=0;j<m;j++){
                    int left=Integer.MAX_VALUE;
                    int right=Integer.MAX_VALUE;
                    if(j>0){
                        left=matrix[i][j]+dp[j-1];
                    }
                    if(j<m-1){
                        right=matrix[i][j]+dp[j+1];
                    }
                    int up=matrix[i][j]+dp[j];
                    dp2[j]=Math.min(Math.min(up,left),right);
                }
                dp=dp2.clone();
                Arrays.fill(dp2,Integer.MAX_VALUE);
            }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[i]);
        }
        return min;









        // int[][] dp=new int[n][m];
        // for(int i=0;i<m;i++){
        //     dp[0][i]=matrix[0][i];
        // }
        //     for(int i=1;i<n;i++){
        //         for(int j=0;j<m;j++){
        //             int left=Integer.MAX_VALUE;
        //             int right=Integer.MAX_VALUE;
        //             if(j>0){
        //                 left=matrix[i][j]+dp[i-1][j-1];
        //             }
        //             if(j<m-1){
        //                 right=matrix[i][j]+dp[i-1][j+1];
        //             }
        //             int up=matrix[i][j]+dp[i-1][j];
        //             dp[i][j]=Math.min(Math.min(up,left),right);
        //         }
        //     }
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<m;i++){
        //     min=Math.min(min,dp[n-1][i]);
        // }
        // return min;



    }
    //     int[][] dp=new int[n][m];
    //     for(int[] arr:dp){
    //         Arrays.fill(arr,Integer.MAX_VALUE);
    //     }
    //     for(int i=0;i<m;i++){
    //         dp[n-1][i]=f(matrix,n-1,i,n,m,dp);
    //     }
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<m;i++){
    //         min=Math.min(min,dp[n-1][i]);

    //     }
    //     return min;
    // }
    // public int f(int[][] matrix,int i,int j,int n,int m,int[][] dp){
        
    //     if(j<0 || j>=m) return 200000;
    //     if(i == 0) return matrix[0][j];
        
    //     if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];

    //     int up=matrix[i][j]+f(matrix,i-1,j,n,m,dp);
    //     int left=matrix[i][j]+f(matrix,i-1,j-1,n,m,dp);
    //     int right=matrix[i][j]+f(matrix,i-1,j+1,n,m,dp);
    //     int a=Math.min(up,left);
    //     return dp[i][j]=Math.min(a,right);
    // }
}