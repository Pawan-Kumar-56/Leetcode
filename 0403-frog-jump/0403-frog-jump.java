import java.util.Arrays;

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;

        if (n == 1) return true;
        if (stones[1] != 1) return false;


        int[][] dp = new int[n][n + 1];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return f(1, n, 1, dp, stones) == 1;
    }

    public int f(int idx, int n, int k, int[][] dp, int[] arr) {
        if (idx == n - 1) return 1;
        if (k <= 0) return 0;
        if (k >= dp[0].length) return 0;

        if (dp[idx][k] != -1) return dp[idx][k];

        int z = 0, x = 0, c = 0;

        for (int j = idx + 1; j < n; j++) {
            int diff = arr[j] - arr[idx];

            if (diff == k - 1 && k - 1 > 0) {
                z = f(j, n, k - 1, dp, arr);
            }

            if (diff == k) {
                x = f(j, n, k, dp, arr);
            }

            if (diff == k + 1) {
                c = f(j, n, k + 1, dp, arr);
            }

            if (z == 1 || x == 1 || c == 1) {
                return dp[idx][k] = 1;
            }
        }

        return dp[idx][k] = 0;
    }
}