class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int l1=1;
        int max1=0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                l1++;
            }
            else{
                l1=1;
            }
            max1=Math.max(l1,max1);
        }
        int l2=1;
        int max2=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                l2++;
            }
            else{
                l2=1;
            }
            max2=Math.max(l2,max2);
        }
        return Math.max(max1,max2);
    }
}