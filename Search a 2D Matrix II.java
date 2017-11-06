public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows=matrix.length,numCols=matrix[0].length;
        int m=0,n=numCols-1;
        while(m<numRows&&n>=0)
        {
            if(matrix[m][n]>target)
                n--;
            else
                if(matrix[m][n]<target)
                    m++;
                else
                    return true;
        }
        return false;
    }
}