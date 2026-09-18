class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> st=new Stack<>();
        int n=intervals.length;
        for(int i=n-1;i>=0;i--){
            st.push(intervals[i]);
        }
        Stack<int[]> ans=new Stack<>();
        while(!st.isEmpty()){
            int[] arr=st.pop();
            int a=arr[0];
            int b=arr[1];
            while(!st.isEmpty()){
                int[] nums=st.peek();
                int a1=nums[0];
                int b1=nums[1];
                if(a1>b){
                    break;
                }
                else{
                    b=Math.max(b,b1);
                    st.pop();
                }
            }
            ans.push(new int[]{a,b});
        }

        int[][] result = new int[ans.size()][];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = ans.pop();
        }
        return result;
    }
}