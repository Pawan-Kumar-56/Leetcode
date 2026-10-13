class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long total=0;
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
            total+=(nums[i]*nums[i]);
        }
        long ans=0;
        Arrays.sort(nums);
        // if(n%2==0){
            int a=n/2;
            for(int i=n-1;i>=a;i--){
                ans+=(nums[i]*nums[i]);
            }
            long small=total-ans;
            return ans-small;

        // }
        // else{
        //     int a=n/2;
        //     for(int i=n-1;i>=a;i--){
        //         ans+=(nums[i]*nums[i]);
        //     }
        //     int small=total-ans;
        //     return ans-small;
        // }

    }
}