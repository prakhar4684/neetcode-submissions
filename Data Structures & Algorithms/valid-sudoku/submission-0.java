class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //row ke liye dekhenge;

        for(int i=0;i<9;i++){
            Set<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                if(set.contains(ch))return false;
                else set.add(ch);
            }
        }
        //column ke liye 
        for(int i=0;i<9;i++){
            Set<Character>set=new HashSet<>();
            for(int j=0;j<9;j++){
                char ch=board[j][i];
                if(ch=='.')continue;
                if(set.contains(ch))return false;
                 set.add(ch);
            }
        }
        //for 3*3 grid
        for(int sr=0;sr<9;sr+=3){
            int er=sr+2;
            for(int sc=0;sc<9;sc+=3){
                int ec=sc+2;
                if(!check(board,sr,er,sc,ec))return false;
            }
        }
        return  true;
    }
    boolean check(char[][] board,int sr,int er,int sc,int ec){
        Set<Character>set=new HashSet<>();
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                 char ch=board[j][i];
                if(ch=='.')continue;
                if(set.contains(ch))return false;
                set.add(ch);
            }
        }
        return true;
    }
}
