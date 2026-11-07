class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return f(0,n-1,nums,dp);
    }
    public int f(int i,int j,int[] nums,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int prev=1;
            int next=1;
            if(i-1>=0) prev=nums[i-1];
            if(j+1<nums.length) next=nums[j+1];
            int cost=f(i,k-1,nums,dp)+f(k+1,j,nums,dp)+prev*nums[k]*next;
            max=Math.max(max,cost);
        }
        return dp[i][j]=max;
    }
}