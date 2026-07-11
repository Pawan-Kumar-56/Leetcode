class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                max=Math.max(max,cnt);
                cnt=0;
            }
            else cnt++;
        }
        max=Math.max(max,cnt);
        return max;
    }
}