public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)
            return 0;
        int numRows=obstacleGrid.length,numCols=obstacleGrid[0].length;
        int dp[][]=new int[numRows][numCols];
        int i,j;
        if(obstacleGrid[0][0]==0)
            dp[0][0]=1;
        else
            return 0;
        for(i=1;i<numCols;i++)
        {
            if(obstacleGrid[0][i]==1)
                dp[0][i]=0;
            else
                dp[0][i]=dp[0][i-1];    
        }
        for(i=1;i<numRows;i++)
        {
            if(obstacleGrid[i][0]==1)
                dp[i][0]=0;
            else
                dp[i][0]=dp[i-1][0];  
        }
        for(i=1;i<numRows;i++)
            for(j=1;j<numCols;j++)
                dp[i][j]=obstacleGrid[i][j]==1?0:dp[i-1][j]+dp[i][j-1];
        return dp[numRows-1][numCols-1];
    }
}