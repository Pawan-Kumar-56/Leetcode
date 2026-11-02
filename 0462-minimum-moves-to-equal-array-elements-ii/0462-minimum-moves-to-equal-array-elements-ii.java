class Solution {
    public int minMoves2(int[] nums) {
         int n=nums.length;
       int ans=0;
       int min=Integer.MAX_VALUE;
       for (int num : nums) {
            min = Math.min(min, num);
        }
        Arrays.sort(nums);
        if(n%2!=0){
            int a=nums[n/2];
            for(int b:nums){
                ans+=Math.abs(a-b);
            }
        }
        else{
            int ans1=0;int ans2=0;
            int a=nums[n/2];
            for(int b:nums){
                ans1+=Math.abs(a-b);
            }

            // int c=nums[n/2-1];
            // for(int d:nums){
            //     ans2+=Math.abs(c-d);
            // }
            ans=Math.max(ans1,ans2);
        }

        return ans;

    }
}