class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int max=0;
        int m=max;
        int cnt=0;
        if(n==1) return 0;
        if(n==0) return 0;
        for(int i=0; i<n-1;i++){
            if(i>max) return -1;
            max=Math.max(i+nums[i],max);
            if(i==m){
                cnt++;
                m=max;
            }
        }
        return cnt;
    }
}