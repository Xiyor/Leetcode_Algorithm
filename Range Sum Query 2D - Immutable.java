public class NumMatrix {
    int storage[][];
    public NumMatrix(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return;
        storage=new int[matrix.length][matrix[0].length];
        int i,j;
        storage[0][0]=matrix[0][0];
        for(i=1;i<matrix[0].length;i++)
            storage[0][i]=storage[0][i-1]+matrix[0][i];
        for(i=1;i<matrix.length;i++)
            storage[i][0]=storage[i-1][0]+matrix[i][0];
        for(i=1;i<matrix.length;i++)
            for(j=1;j<matrix[0].length;j++)
                storage[i][j]=storage[i-1][j]+storage[i][j-1]-storage[i-1][j-1]+matrix[i][j];
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(storage==null)
            return 0;
        if(row1==0&&col1==0)
            return storage[row2][col2];
        if(row1==0)
            return storage[row2][col2]-storage[row2][col1-1];
        if(col1==0)
            return storage[row2][col2]-storage[row1-1][col2];
        return storage[row2][col2]-storage[row1-1][col2]-storage[row2][col1-1]+storage[row1-1][col1-1];
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);