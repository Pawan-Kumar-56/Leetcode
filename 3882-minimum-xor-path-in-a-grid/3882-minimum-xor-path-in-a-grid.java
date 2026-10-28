import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Set<Integer>[] dp = new HashSet[n * m];

        for (int i = 0; i < n * m; i++) {
            dp[i] = new HashSet<>();
        }

        dp[0].add(grid[0][0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int idx = i * m + j;

                if (i > 0) {
                    for (int x : dp[(i - 1) * m + j]) {
                        dp[idx].add(x ^ grid[i][j]);
                    }
                }

                if (j > 0) {
                    for (int x : dp[i * m + j - 1]) {
                        dp[idx].add(x ^ grid[i][j]);
                    }
                }
            }
        }

        return Collections.min(dp[n * m - 1]);
    }
}