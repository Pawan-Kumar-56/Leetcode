class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    if(i==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=dp[i-1][j]+1;
                    }
                    int h=dp[i][j];
                    for(int k=j;k>=0;k--){
                        if(dp[i][k]==0) break;
                        h=Math.min(dp[i][k],h);
                        int width=j-k+1;
                        int area=h*width;
                        max=Math.max(max,area);
                    }
                }
            }
        }
        return max;
    }
}