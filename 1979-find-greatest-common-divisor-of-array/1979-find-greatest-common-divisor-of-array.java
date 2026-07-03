class Solution {
    public int findGCD(int[] nums) {
        int min=10000;
        int max=0;
        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        if(max==min) return max;
        return find(min,max);
        
    }
    public int find(int min,int max){
        int ans=1;
        for(int i=2;i<=max/2;i++){
            if(max%i==0 && min%i==0) ans=Math.max(i,ans);
        }
        return ans;
    }
}