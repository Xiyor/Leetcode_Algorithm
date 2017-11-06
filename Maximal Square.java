public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;
        int numRows=matrix.length,numCols=matrix[0].length;
        int dp[][]=new int[numRows][numCols];
        dp[0][0]=matrix[0][0]-'0';
        int i,j;
        int res=dp[0][0];
        for(i=1;i<numCols;i++)
        {
            dp[0][i]=matrix[0][i]-'0';
            res=Math.max(res,dp[0][i]);
        }
        for(i=1;i<numRows;i++)
        {
            dp[i][0]=matrix[i][0]-'0';
            res=Math.max(res,dp[i][0]);
        }
        for(i=1;i<numRows;i++)
            for(j=1;j<numCols;j++)
            {
                dp[i][j]=matrix[i][j]=='0'?0:(minInThree(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+1);
                res=Math.max(dp[i][j],res);
            }
        return res*res;
    }
    int minInThree(int a,int b,int c)
    {
        if(a<=b&&a<=c)
            return a;
        if(b<=a&&b<=c)
            return b;
        return c;
    }
}