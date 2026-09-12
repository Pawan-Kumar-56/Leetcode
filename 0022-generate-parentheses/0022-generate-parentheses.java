class Solution {
    List<String> list=new ArrayList<>();
    StringBuilder sb=new StringBuilder();

    public List<String> generateParenthesis(int n) {
        f(0,0,n);
        return list;
    }
    public void f(int open,int close,int n){
        if(sb.length()==2*n){
            list.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            f(open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if (close < open) {
            sb.append(')');
            f(open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
        
    }
}