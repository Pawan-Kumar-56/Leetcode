class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new Stack<>();
        int n=height.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int num=height[i];
            while(!st.isEmpty() && num>height[st.peek()]){
                int bottom=st.pop();
                if(st.isEmpty()) break;
                int h=Math.min(height[st.peek()],height[i])-height[bottom];
                int width=i-st.peek()-1;
                int area=h*width;
                ans+=area;
            }
            st.push(i);
        }
        return ans;
    }
}