public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo=0,hi=matrix.length*matrix[0].length-1,mi=-1,i,j;
        while(lo<=hi)
        {
            mi=(lo+hi)/2;
            i=mi/matrix[0].length;
            j=mi-i*matrix[0].length;
            if(matrix[i][j]>target)
            {
                hi=i*matrix[0].length+j-1;
            }
            else
            {
                if(matrix[i][j]<target)
                {
                    lo=i*matrix[0].length+j+1;
                }
                else
                    return true;
            }
        }
        return false;
    }
}