class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        f(0,candidates,n,0,target);
        return ans;
    }
    public void f(int idx,int[] arr,int n,int sum,int target){
        if(idx==n){
            if(sum==target){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(idx>n || sum>target) return;
        list.add(arr[idx]);
        f(idx,arr,n,sum+arr[idx],target);
        list.remove(list.size()-1);
        f(idx+1,arr,n,sum,target);
    }
}