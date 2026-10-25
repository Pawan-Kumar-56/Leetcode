class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];
        for(int[][] arr:dp){
            for(int[] nums:arr){
                Arrays.fill(nums,-1);
            }
        }
        return f(0,1,2,prices,dp);
    }

    public int f(int i,int buy,int tran,int[] prices,int[][][] dp){

        if(tran>0){
            if(i>=prices.length) return 0;
            if(dp[i][buy][tran]!=-1) return dp[i][buy][tran];
            if(buy==1){
                dp[i][buy][tran]=Math.max(-prices[i]+f(i+1,0,tran,prices,dp),0+f(i+1,1,tran,prices,dp));
            }
            else{
                dp[i][buy][tran]=Math.max(prices[i]+f(i+1,1,tran-1,prices,dp),0+f(i+1,0,tran,prices,dp));
            }
            return dp[i][buy][tran];
        }
        return 0;
        



    }
}