class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] dp=new int[n][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return n-f(n-1,n-1,s,s2,dp);
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