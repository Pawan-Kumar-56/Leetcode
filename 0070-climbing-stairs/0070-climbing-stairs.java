class Solution {
    public int climbStairs(int n) {
        if (n <= 1) return 1;

        int prev2 = 1; // dp[0]
        int prev1 = 1; // dp[1]

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    // public int climbStairs(int n) {
    //     if (n <= 2) return n;

    //     int[] dp = new int[n + 1];

    //     dp[1] = 1;
    //     dp[2] = 2;

    //     for (int i = 3; i <= n; i++) {
    //         dp[i] = dp[i - 1] + dp[i - 2];
    //     }

    //     return dp[n];
    // }
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        // return f(0, n, dp);
    // }

    // public int f(int idx, int n, int[] dp) {
    //     if (idx == n) return 1;
    //     if (idx > n) return 0;

    //     if (dp[idx] != -1) return dp[idx];

    //      return dp[idx] = f(idx + 1, n, dp)
    //             + f(idx + 2, n, dp);
    // }
}
