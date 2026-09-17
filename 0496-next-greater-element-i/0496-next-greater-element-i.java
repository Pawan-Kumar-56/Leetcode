class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;

















        // int n=nums1.length;
        // int m=nums2.length;
        // int[] ans=new int[n];
        // int k=0;
        // for(int i=0;i<n;i++){
        //     int j=0;
        //     while(nums1[i]!=nums2[j]){
        //         j++;
        //     }
        //     j++;
        //     int b=-2;
        //     while(j<m){
        //         if(nums2[j]>nums1[i]){
        //             ans[k]=nums2[j];
        //             k++;
        //             b=0;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(b==-2){
        //         ans[k]=-1;
        //         k++;
        //     }
            

        // }
        // return ans;
    }
}