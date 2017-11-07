public class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0)
            return 0;
        int numRows=grid.length,numCols=grid[0].length;
        int res=0;
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numCols;j++)
            {
                if(grid[i][j]!='0')
                {
                    res++;
                    merge(grid,numRows,numCols,i,j);
                }
            }
        return res;
    }
    void merge(char[][] grid,int m,int n,int i,int j)
    {
        if(i<0||i>=m||j<0||j>=n)
            return;
        if(grid[i][j]!='1')
            return;
        grid[i][j]='0';
        merge(grid,m,n,i-1,j);
        merge(grid,m,n,i+1,j);
        merge(grid,m,n,i,j-1);
        merge(grid,m,n,i,j+1);
    }
}