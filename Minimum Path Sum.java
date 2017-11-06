public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0)
            return 0;
        int numRows=grid.length,numCols=grid[0].length;
        int [][]dp=new int[numRows][numCols];
        dp[0][0]=grid[0][0];
        int i,j;
        for(i=1;i<numCols;i++)
            dp[0][i]=dp[0][i-1]+grid[0][i];
        for(i=1;i<numRows;i++)
            dp[i][0]=dp[i-1][0]+grid[i][0];
        for(i=1;i<numRows;i++)
            for(j=1;j<numCols;j++)
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
        return dp[numRows-1][numCols-1];
    }
}