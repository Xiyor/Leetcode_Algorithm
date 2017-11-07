public class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null||board.length==0||board[0].length==0)
            return;
        int numRows=board.length,numCols=board[0].length;
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numCols;j++)
            {
                int numLives=numCalNei(board,numRows,numCols,i,j);
                if(board[i][j]==1&&(numLives==2||numLives==3))
                    board[i][j]=3;
                if(board[i][j]==0&&numLives==3)
                    board[i][j]=2;
            }
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numCols;j++)
                board[i][j]>>=1;
    }
    int numCalNei(int[][] board,int m,int n,int i,int j)
    {
        int res=0;
        for(int x=Math.max(0,i-1);x<=Math.min(m-1,i+1);x++)
            for(int y=Math.max(0,j-1);y<=Math.min(n-1,j+1);y++)
            {
                res+=board[x][y]&1;
            }
        res-=board[i][j]&1;
        return res;
    }
}