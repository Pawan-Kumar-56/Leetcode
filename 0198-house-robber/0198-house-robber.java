class Solution {
    public int rob(int[] nums) {




        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];

    }







        // int n=nums.length;
        // if(n==1) return nums[0];
        // if(n==2){
        //     return Math.max(nums[0],nums[1]);
        // }
        // int[] dp=new int[n];
        // Arrays.fill(dp,-1);
        // f(nums,0,n,dp);
        // return dp[0];
    // }
    // public int f(int[] nums,int idx,int n,int[] dp){
    //     if(idx>=n) return 0;
    //     if(dp[idx]!=-1) return dp[idx];

    //     return dp[idx]=Math.max(nums[idx]+f(nums,idx+2,n,dp),
    //     f(nums,idx+1,n,dp));
        
    // }
}