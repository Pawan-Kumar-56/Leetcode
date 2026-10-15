class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<n;j++){
            
            for(int i=j;i<n;i++){
                map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
                sum+=(map.size()*map.size());
            }
            map.clear();
        }
        return sum;
    }
}