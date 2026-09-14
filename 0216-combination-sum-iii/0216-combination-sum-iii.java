class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums=new int[9];
        for(int i=0;i<9;i++){
            nums[i]=i+1;
        }
        int n1=nums.length;
        f(0,n1,nums,n,0,k);
        return ans;
    }
    public void f(int idx,int n,int[] arr,int target,int sum,int k){
        if(idx==n){
            if(list.size()==k && sum==target){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[idx]);
        f(idx+1,n,arr,target,sum+arr[idx],k);
        list.remove(list.size()-1);
        f(idx+1,n,arr,target,sum,k);
    }
}