class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(coins,n-1,amount,dp);
    }
    public int f(int[] arr,int idx,int target,int[][] dp){
        if(target==0) return 1;
        if(idx==0){
            if(target%arr[0]==0){
                return 1;
            }
            return 0;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int nottake=f(arr,idx-1,target,dp);
        int take=0;
        if(arr[idx]<=target){
            take=f(arr,idx,target-arr[idx],dp);
        }
        return dp[idx][target]=nottake+take;
    }
}