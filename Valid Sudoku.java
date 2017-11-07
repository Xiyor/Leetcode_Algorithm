public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][]=new boolean[9][9];
        boolean col[][]=new boolean[9][9];
        boolean block[][]=new boolean[9][9];
        int temp;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                else
                {
                    temp=board[i][j]-'1';
                    if(row[i][temp]||col[j][temp]||block[i/3*3+j/3][temp])
                    {
                        return false;
                    }
                    row[i][temp]=col[j][temp]=block[i/3*3+j/3][temp]=true;
                }
            }
        }
        return true;
    }
}