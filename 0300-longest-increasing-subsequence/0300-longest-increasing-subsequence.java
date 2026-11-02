class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(0,nums,-1,dp);
    }
    public int f(int idx,int[] nums,int prev,int[][] dp){
        if(idx==nums.length){
            return 0;
        }
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        int take=0;
        if(prev==-1 || nums[prev]<nums[idx]){
            take=1+f(idx+1,nums,idx,dp);
        }
        int nottake=f(idx+1,nums,prev,dp);
        return dp[idx][prev+1]=Math.max(take,nottake);
    }
}