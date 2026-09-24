class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=(i<n?heights[i]:0))){
                int h=heights[st.pop()];
                int w=0;
                if(st.isEmpty()){
                    w=i;
                }
                else{
                    w=i-st.peek()-1;
                }
                int area=h*w;
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}