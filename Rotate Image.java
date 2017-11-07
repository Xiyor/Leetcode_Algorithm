public class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int i,j,temp;
        for(i=0;i<n/2;i++)
        {
            for(j=0;j<n;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}