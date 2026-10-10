class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        // Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> q=new PriorityQueue<>(
             (a, b) -> b[1] - a[1]
        );
        for(int key:map.keySet()){
            q.offer(new int[]{key,map.get(key)});
        }
        int[] ans=new int[k];
        int i=0;
        while(k>0){
            ans[i]=q.poll()[0];
            i++;
            k--;
        }
        return ans;
    }
}