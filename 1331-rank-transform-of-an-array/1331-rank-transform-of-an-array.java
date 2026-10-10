class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        PriorityQueue<int[]> q=new PriorityQueue<>(
            (a,b)->Integer.compare(a[0],b[0])
        );
        for(int i=0;i<n;i++){
            q.offer(new int[]{arr[i],i});

        }
        int[] ans=new int[n];
        int rank=1;
        int prev=-1;
        boolean check=false;
        while(!q.isEmpty()){
            int[] nums=q.poll();
            if(check && nums[0]==prev){
                ans[nums[1]]=rank-1;
            }
            else{
                ans[nums[1]]=rank;
                rank++;
            }
            prev=nums[0];
            check=true;
            
        }
        return ans;

    }
}