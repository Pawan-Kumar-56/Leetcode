class Solution {
    public int maxProfit(int[] prices, int fee) {
       int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] arr:dp) Arrays.fill(arr,-1);
        return f(0,1,prices,dp,fee);
    }
    public int f(int i,int buy,int[] prices,int[][] dp,int fee){

        if(i>=prices.length) return 0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
            dp[i][buy]=Math.max(-prices[i]-fee+f(i+1,0,prices,dp,fee),0+f(i+1,1,prices,dp,fee));
        }
        else{
            dp[i][buy]=Math.max(prices[i]+f(i+1,1,prices,dp,fee),0+f(i+1,0,prices,dp,fee));
        }
        return dp[i][buy];



    }
}