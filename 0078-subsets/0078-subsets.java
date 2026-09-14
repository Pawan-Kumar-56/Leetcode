class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort((nums));
        int n=nums.length;
        f(0,n,nums);
        return ans;
    }
    public void f(int idx,int n,int[] arr){
        if(idx==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        f(idx+1,n,arr);
        list.remove(list.size()-1);
        f(idx+1,n,arr);
    }
}