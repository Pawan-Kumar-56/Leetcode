class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int m=nums.length;
        int[] ans=new int[n];
        Stack<int[]> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int idx=-1;
        for(int num:nums) max=Math.max(max,num);
        for(int num:nums){
            
            while(!st.isEmpty() && st.peek()[0]<num){
                int[] temp = st.pop();
                ans[temp[1]] = num;

            }
            st.push(new int[]{num,idx+1});
            idx++;
        }
        while(!st.isEmpty()){
            int flag=0;
            int[] arr=st.pop();
            int a=arr[0];
            int b=arr[1];
            if(a!=max){
                for(int i=0;i<n;i++){
                    if(nums[i]>a){
                        ans[b]=nums[i];
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0){
                ans[b]=-1;
            }   
        }
        return ans;
    }
}