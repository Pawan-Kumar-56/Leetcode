class Solution {
    public int numSubseq(int[] nums, int target) {
        final int mod = 1000000007;
        int n=nums.length;
        Arrays.sort(nums);
        int j=n-1;
        int i=0;
        long cnt=0;

        long[] power = new long[n];
        power[0] = 1;
        for (int k = 1; k < n; k++) {
            power[k] = (power[k - 1] * 2) % mod;
        }

        while(i<=j){
            if(nums[i]+nums[j]<=target){
                cnt=(cnt+power[j-i]) % mod;
                i++;
            }
            else j--;
        }
        return (int)cnt;
    }
}