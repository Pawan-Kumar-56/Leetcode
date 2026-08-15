class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> hash=new HashSet<>();
        for(int k=0;k<n-1;k++){
            int i=k+1;
            int j=n-1;
            int target=0-nums[k];
            while(i<j){
                List<Integer> list=new ArrayList<>();
                int sum=nums[i]+nums[j];
                if(sum==target){
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    if(hash.add(list)){
                        ans.add(list);
                    }
                    i++;
                    j--;
                }
                else if(sum<target){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return ans;
    }
}