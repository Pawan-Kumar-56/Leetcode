class Solution {
    boolean solved = false;
    public void solveSudoku(char[][] board) {
        f(board);
    }
    public void f(char[][] mat){
        if (solved) { return; }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                        if(check(mat,i,j,ch)){
                            mat[i][j]=ch;
                            f(mat);
                            if (solved) { return; }
                            mat[i][j]='.';
                        }
                    }
                    return;
                }
            }
        }
        solved=true;
    }
    public boolean check(char[][] mat,int i,int j,int num){
        int sr=(i/3)*3;
        int sc=(j/3)*3;
        for(int a=sr;a<sr+3;a++){
            for(int b=sc;b<sc+3;b++){
                if(mat[a][b]==num){
                    return false;
                }
            }
        }

        for(int k=0;k<9;k++){
            if(mat[i][k]==num) return false;
        }
        for(int k=0;k<9;k++){
            if(mat[k][j]==num) return false;
        }
        return true;
    }
}