class Solution {
    public int lengthOfLIS(int[] nums) {
        // int n=nums.length;
        // int[][] dp=new int[n][n+1];
        // for(int[] arr:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(0,nums,-1,dp);
        int n=nums.length;
        int[][] dp=new int[n+1][n+2];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                int take=0;
                if(j==0 || nums[j-1]<nums[i]){
                    take=1+dp[i+1][i+1];
                }
                int nottake=dp[i+1][j];
                dp[i][j]=Math.max(nottake,take);
            }
        }
        return dp[0][0];

    }
    // public int f(int idx,int[] nums,int prev,int[][] dp){
    //     if(idx==nums.length){
    //         return 0;
    //     }
    //     if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
    //     int take=0;
    //     if(prev==-1 || nums[prev]<nums[idx]){
    //         take=1+f(idx+1,nums,idx,dp);
    //     }
    //     int nottake=f(idx+1,nums,prev,dp);
    //     return dp[idx][prev+1]=Math.max(take,nottake);
    // }
}