
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            diff[l]++;
            diff[r+1]--;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            count += diff[i];

            if (nums[i] > count) {
                return false;
            }
        }

        return true;
    }
}
