import java.util.*;

class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int sum = 0;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int a = (int) Math.sqrt(n);

        for (int i = 1; i <= a; i++) {
            if (n % i == 0) {
                if (f(nums, sorted, i)) {
                    sum += i;
                }

                int k = n / i;

                if (k != i && f(nums, sorted, k)) {
                    sum += k;
                }
            }
        }

        return sum;
    }

    public boolean f(int[] arr, int[] sorted, int k) {
        int n = arr.length;

        for (int start = 0; start < n; start += k) {
            int[] lps = new int[k];

            // Build KMP prefix array for the sorted block
            int j = 0;

            for (int i = 1; i < k; i++) {
                while (j > 0 &&
                       sorted[start + i] != sorted[start + j]) {
                    j = lps[j - 1];
                }

                if (sorted[start + i] == sorted[start + j]) {
                    j++;
                }

                lps[i] = j;
            }

            // Search the sorted block in the circular input block
            j = 0;
            boolean found = false;

            for (int i = 0; i < 2 * k - 1; i++) {
                int val = arr[start + (i % k)];

                while (j > 0 && val != sorted[start + j]) {
                    j = lps[j - 1];
                }

                if (val == sorted[start + j]) {
                    j++;
                }

                if (j == k) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}