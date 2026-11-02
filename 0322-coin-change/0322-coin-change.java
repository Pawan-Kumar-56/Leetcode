class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        int ans=f(n-1,amount,coins,dp);
        return ans >= (int)1e9 ? -1 : ans;
    }
    public int f(int idx,int target,int[] arr,int[][] dp){
        if(idx==0){
            if(target%arr[0]==0){
                return target/arr[0];
            }
            else return (int)1e9;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }
        int nottake=f(idx-1,target,arr,dp);
        int take=(int)1e9;
        if(arr[idx]<=target){
            take=1+f(idx,target-arr[idx],arr,dp);
        }
        return dp[idx][target]=Math.min(nottake,take);
    }
}
