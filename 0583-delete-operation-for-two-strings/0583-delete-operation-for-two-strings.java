class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n][n2];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        int a=f(n-1,n2-1,word1,word2,dp);
        return n-a+n2-a;
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