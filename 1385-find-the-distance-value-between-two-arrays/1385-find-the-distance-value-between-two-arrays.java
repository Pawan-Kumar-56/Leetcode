class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1=arr1.length;
        int ans=0;
        int n2=arr2.length;
        int a=0;
        // Arrays.sort(arr2);
        for(int i=0;i<n1;i++){
            a=0;
            for(int j=n2-1;j>=0;j--){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    a=1;
                    break;
                }
            }
            if(a==0){
                ans++;
            }
        }
        return ans;
    }
}