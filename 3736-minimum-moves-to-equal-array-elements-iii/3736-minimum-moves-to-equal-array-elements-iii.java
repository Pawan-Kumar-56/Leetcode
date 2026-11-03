class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int ans=0;
        for(int num:nums){
            ans+=(Math.abs(num-max));
        }
        return ans;
    }
}