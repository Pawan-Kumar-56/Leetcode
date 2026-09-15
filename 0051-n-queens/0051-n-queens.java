class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[] arr=new int[n];
        f(0,n,arr);
        return ans;
    }
    public void f(int idx,int n,int[] arr){
        if(idx==n){
            print(arr);
            return;
        }
        for(int i=0;i<n;i++){
            arr[idx]=i;
            if(check(idx,arr)){
                f(idx+1,n,arr);
            }

        }
    }
    public boolean check(int row,int[] arr){
        for(int i=0;i<row;i++){
            if(arr[i]==arr[row]){
                return false;
            }
            if(Math.abs(i-row)==Math.abs(arr[i]-arr[row])) return false;
        }
        return true;

    }
    public void print(int[] arr){
        List<String> board = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            char[] row = new char[arr.length];
            Arrays.fill(row, '.');
            row[arr[i]] = 'Q';
            board.add(new String(row));
        }
        ans.add(board);
    }
}