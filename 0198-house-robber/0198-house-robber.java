class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        f(nums,0,n,dp);
        return dp[0];
    }
    public int f(int[] nums,int idx,int n,int[] dp){
        if(idx>=n) return 0;
        if(dp[idx]!=-1) return dp[idx];

        return dp[idx]=Math.max(nums[idx]+f(nums,idx+2,n,dp),
        f(nums,idx+1,n,dp));
        
    }
}