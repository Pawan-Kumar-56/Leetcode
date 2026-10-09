class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> list;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        // this.nums=new int[nums.length-1];
        list=new PriorityQueue<>();
        for(int num:nums){
            list.add(num);
            if(list.size()>k) list.poll();
        }
        
    }
    
    public int add(int val) {
        list.offer(val);
        if(list.size()>k){
            list.poll();
        }
        return list.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */