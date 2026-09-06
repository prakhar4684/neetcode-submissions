class Solution {
    int m,n;
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

    boolean dfs(int i,int j,int idx,String word,char [][]board){
            if(idx>=word.length() )return true;
            if(i>=m || i<0 || j>=n || j<0|| board[i][j]=='&'){
                return false;
            }
           
            for(int d[]:dir){
                char ch=board[i][j];
                board[i][j]='&';
                int i_=i+d[0],j_=j+d[1];
                if(word.charAt(idx)==ch){
                    if(dfs(i_,j_,idx+1,word,board))return true;
                }
                board[i][j]=ch;
            }
            return false;
    }
    public boolean exist(char[][] board, String word) {
        m=board.length;
        n=board[0].length;
        if(word.length()>m*n)return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,0,word,board))return true;
                }
            }
        }
        return false;
    }
}
