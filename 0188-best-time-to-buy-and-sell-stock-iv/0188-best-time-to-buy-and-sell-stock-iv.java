class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n + 1][2][k+1];

        for (int i = n - 1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int tran = 1; tran <= k; tran++) {
                    if (buy == 1) {
                        dp[i][buy][tran] = Math.max(
                            -prices[i] + dp[i + 1][0][tran],
                            dp[i + 1][1][tran]
                        );
                    } else {
                        dp[i][buy][tran] = Math.max(
                            prices[i] + dp[i + 1][1][tran - 1],
                            dp[i + 1][0][tran]
                        );
                    }
                }
            }
        }

        return dp[0][1][k];
    }
}