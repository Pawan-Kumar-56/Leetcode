class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            j++;
            int b=-2;
            while(j<m){
                if(nums2[j]>nums1[i]){
                    ans[k]=nums2[j];
                    k++;
                    b=0;
                    break;
                }
                j++;
            }
            if(b==-2){
                ans[k]=-1;
                k++;
            }
            

        }
        return ans;
    }
}