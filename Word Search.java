public class Solution {
    public boolean exist(char[][] board, String word) {
        int numRows=board.length,numCols=board[0].length;
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numCols;j++)
                if(dfs(board,numRows,numCols,i,j,0,word))
                    return true;
        return false;
    }
    boolean dfs(char[][] board,int m,int n,int i,int j,int k,String s)
    {
        if(i<0||i>=m||j<0||j>=n)
            return false;
        if(s.charAt(k)==board[i][j])
        {
            if(k==s.length()-1)
                return true;
            char temp=board[i][j];
            board[i][j]='#';
            if(dfs(board,m,n,i-1,j,k+1,s)||dfs(board,m,n,i+1,j,k+1,s)||dfs(board,m,n,i,j-1,k+1,s)||dfs(board,m,n,i,j+1,k+1,s))
                return true;
            else
                board[i][j]=temp;
            
        }
        return false;
    }
}