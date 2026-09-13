class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n=candidates.length;
        f(0,candidates,n,0,target);
        return ans;
    }
    public void f(int idx,int[] arr,int n,int sum,int target){
        if(idx==n){
            if(sum==target){
                if(!ans.contains(list)){
                    ArrayList<Integer> list1=new ArrayList<>(list);
                    
                    ans.add(list1);
                }
            }
            return;
        }
        if(idx>n || sum>target) return;
        list.add(arr[idx]);
        f(idx+1,arr,n,sum+arr[idx],target);
        list.remove(list.size()-1);
        int next=idx+1;
        while(next<n && arr[next]==arr[idx]){
            next++;
        }
        f(next,arr,n,sum,target);
    }
}