class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        f(0,nums,target,0);
        return ans;
    }
    public void f(int idx,int[] nums,int target,int sum){
        if(idx==nums.length){
            if(sum==target){
                ans++;
            }
            return;
        }
        f(idx+1,nums,target,sum+nums[idx]);
        f(idx+1,nums,target,sum-nums[idx]);
    }
}