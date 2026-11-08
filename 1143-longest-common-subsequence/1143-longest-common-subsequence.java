class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        // int[][] dp=new int[n][m];
        // for(int[] a:dp) Arrays.fill(a,-1);
        // return f(n-1,m-1,text1,text2,dp);

        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public int f(int i,int j,String s1,String s2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+f(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
    }
}