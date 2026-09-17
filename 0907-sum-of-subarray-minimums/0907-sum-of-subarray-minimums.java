class Solution {
    public int sumSubarrayMins(int[] arr) {
        int total=0;
        int mod=1000000007;
        int n=arr.length;
        int[] pr=pse(arr);
        int[] ns=nse(arr);
        for(int i=0;i<n;i++){
            int left=i-pr[i];
            int right=ns[i]-i;
            long mul=left*right*1L;
            int val = (int)((mul * arr[i]) % mod);
            total=(total+val)%mod;
        }
        return total;

    }
    public int[] pse(int[] arr){
        int[] ans=new int[arr.length];
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if (!st.isEmpty())
                ans[i]=st.peek();
            else
                ans[i]=-1;

            st.push(i);
        }
        return ans;
    }
    public int[] nse(int[] arr){
        int[] ans=new int[arr.length];
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if (!st.isEmpty())
                ans[i]=st.peek();
            else
                ans[i]=n;

            st.push(i);
        }
        return ans;
    }

}