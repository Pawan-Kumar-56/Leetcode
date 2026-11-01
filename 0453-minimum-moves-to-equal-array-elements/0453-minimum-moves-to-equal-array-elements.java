class Solution {
    public int minMoves(int[] nums) {
       int n=nums.length;
       int ans=0;
       int min=Integer.MAX_VALUE;
       for (int num : nums) {
            min = Math.min(min, num);
        }

        for (int num : nums) {
            ans += num - min;
        }

        return ans;

    }
}