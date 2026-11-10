class Solution {
    int min=Integer.MAX_VALUE;
    public int climbStairs(int n, int[] costs) {
        int n1=costs.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return f(0,costs,dp);
    }
    public int f(int i,int[] arr,int[] dp){
        if(i==arr.length){
            return 0;
        }
        if(i>arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        if(i+1<=arr.length){
            a=arr[i]+1+f(i+1,arr,dp);
        }
        if(i+2<=arr.length){
            b=arr[i+1]+4+f(i+2,arr,dp);
        }
        if(i+3<=arr.length){
            c=arr[i+2]+9+f(i+3,arr,dp);
        }
        return dp[i]=Math.min(Math.min(a,b),c);
        
    }
}