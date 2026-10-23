class Solution {
    public int sortPermutation(int[] nums) {
        int k=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                if(k==-1){
                    k=nums[i];
                    
                }
                k=k&nums[i];
            }
        }
        if(k==-1) return 0;
        return k;
    }
}