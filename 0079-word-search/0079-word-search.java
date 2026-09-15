class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(f(i,j,board,word,0)) return true;
            }
        }
        return false;
    }
    public boolean f(int i,int j,char[][] board,String word,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx)) return false;
        char ch=board[i][j];
        board[i][j]='1';
        boolean a;
        if(true){
            a=  f(i-1,j,board,word,idx+1) ||
                    f(i+1,j,board,word,idx+1) ||
                    f(i,j+1,board,word,idx+1) ||
                    f(i,j-1,board,word,idx+1) ;
        }
        board[i][j]=ch;
        return a;
    }
}