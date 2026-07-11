class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            if(map.contains(nums[i])) return true;
            map.add(nums[i]);
        }
        return false;
    }
}