class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        int ans = f(0, 0, amount, coins, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public int f(int idx, int sum, int amount,
                 int[] arr, int[][] dp) {

        if (sum == amount) return 0;

        if (sum > amount || idx == arr.length) {
            return Integer.MAX_VALUE;
        }

        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }

        // Take current coin (unlimited supply)
        int take = Integer.MAX_VALUE;

        int next = f(idx, sum + arr[idx], amount, arr, dp);

        if (next != Integer.MAX_VALUE) {
            take = 1 + next;
        }

        // Don't take current coin
        int nottake = f(idx + 1, sum, amount, arr, dp);

        return dp[idx][sum] = Math.min(take, nottake);
    }
}