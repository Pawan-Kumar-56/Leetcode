
import java.util.Arrays;

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(0, n, dp);
    }

    public int f(int idx, int n, int[] dp) {
        if (idx == n) return 1;
        if (idx > n) return 0;

        if (dp[idx] != -1) return dp[idx];

        dp[idx] = f(idx + 1, n, dp)
                + f(idx + 2, n, dp);

        return dp[idx];
    }
}
