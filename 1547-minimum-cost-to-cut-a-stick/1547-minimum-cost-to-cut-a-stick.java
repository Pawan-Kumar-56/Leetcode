class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int l=cuts.length;
        int[] arr=new int[l+2];
        for(int i=1;i<=l;i++){
            arr[i]=cuts[i-1];
        }
        int len=arr.length;
        arr[0]=0;
        arr[len-1]=n;
        int[][] dp=new int[len][len];
        for(int[] a:dp) Arrays.fill(a,-1);
        return f(1,l,arr,dp);
    }
    public int f(int i,int j,int[] arr,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost=arr[j+1]-arr[i-1]+f(i,k-1,arr,dp)+f(k+1,j,arr,dp);
            min=Math.min(min,cost);
        }
        return dp[i][j]=min;
    }
}