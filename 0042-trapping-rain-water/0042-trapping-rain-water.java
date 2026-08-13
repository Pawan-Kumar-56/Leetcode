class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        // st.push(0);
        // int min=height[0];
        int n=height.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int num=height[i];
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int bottom=st.pop();
                if(st.isEmpty()){
                    break;
                }
                int left=st.peek();
                int width=i-left-1;
                int h=Math.min(height[st.peek()],height[i])-height[bottom]; 
                ans+=width*h;
            }
            st.push(i);
        }
        return ans;
    }
}