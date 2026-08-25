class Solution {
    public int minMaxGame(int[] nums) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);

        }
        int n=nums.length;
        if(n==1) return nums[0];
        boolean flag=true;
        int a=0;
        while(q.size()>1){
            
            int x=q.poll();
            int y=q.poll();
            if(flag){
                q.add(Math.min(x,y));
                flag=!flag;
            }
            else{
                q.add(Math.max(x,y));
                flag=!flag;
            }
            a++;
            if(n/2==a){
                flag=true;
                n=n/2;
            }
        }
        return q.poll();

    }
}