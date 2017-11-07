public class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean row_Zero=false;
        boolean col_Zero=false;
        int i,j;
        for(i=0;i<n;i++)
        {
            if(matrix[0][i]==0)
            {
                row_Zero=true;
                break;
            }
        }
        for(i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                col_Zero=true;
                break;
            }
        }
        for(i=1;i<m;i++)
            for(j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        for(i=1;i<m;i++)
            for(j=1;j<n;j++)
            {
                if(matrix[0][j]==0||matrix[i][0]==0)
                {
                    matrix[i][j]=0;
                }
            }
        if(row_Zero)
        {
            for(i=0;i<n;i++)
                matrix[0][i]=0;
        }
        if(col_Zero)
        {
            for(i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}