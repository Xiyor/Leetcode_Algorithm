public class Solution {
        static final int[][] dir={{-1,0},{0,-1},{1,0},{0,1}}; 
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;
        int numRows=matrix.length,numCols=matrix[0].length;
        int res=0;
        int record[][]=new int[numRows][numCols];
        for(int i=0;i<numRows;i++)
            for(int j=0;j<numCols;j++)
                res=Math.max(res,calPath(matrix,numRows,numCols,i,j,record));
        return res;
    }
    int calPath(int[][] matrix,int mm,int nn,int i,int j,int[][] record)
    {
        if(record[i][j]>0)
            return record[i][j];
        int res=0;
        for(int m=0;m<dir.length;m++)
            if(i+dir[m][0]>=0&&i+dir[m][0]<mm&&j+dir[m][1]>=0&&j+dir[m][1]<nn&&matrix[i][j]<matrix[i+dir[m][0]][j+dir[m][1]])
                res=Math.max(res,calPath(matrix,mm,nn,i+dir[m][0],j+dir[m][1],record));
        record[i][j]=++res;
        return res;
    }
}