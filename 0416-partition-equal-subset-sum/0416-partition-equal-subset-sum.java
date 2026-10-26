class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        if(total%2!=0) return false;
        int search=total/2;
        Boolean dp[][]=new Boolean[n][search+1];
        return f(0,nums,search,0,dp);
    }
    public boolean f(int idx,int[] nums,int target,int sum,Boolean[][] dp){
        if(sum==target) return true;
        if(idx==nums.length){
            if(sum==target){
                return true;
            }
            return false;
        }

        if(dp[idx][sum]!=null) return dp[idx][sum];

        boolean nottake=f(idx+1,nums,target,sum,dp);
        boolean take=false;
        if(target>=sum+nums[idx]){
            take=f(idx+1,nums,target,sum+nums[idx],dp);
        }
        boolean ans=nottake || take;
        dp[idx][sum]=ans;
        return ans;
    }
}