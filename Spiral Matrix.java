public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<Integer>();
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return res;
        int numRows=matrix.length,numCols=matrix[0].length;
        int up=0,down=numRows-1,left=0,right=numCols-1;
        int i;
        while(left<=right&&up<=down)
        {
            if(left==right)
            {
                for(i=up;i<=down;i++)
                    res.add(matrix[i][left]);
                break;
            }
            if(up==down)
            {
                for(i=left;i<=right;i++)
                    res.add(matrix[up][i]);
                break;
            }
            for(i=left;i<right;i++)
                res.add(matrix[up][i]);
            for(i=up;i<down;i++)
                res.add(matrix[i][right]);
            for(i=right;i>left;i--)
                res.add(matrix[down][i]);
            for(i=down;i>up;i--)
                res.add(matrix[i][left]);
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
}