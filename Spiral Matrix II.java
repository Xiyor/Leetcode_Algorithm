public class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]=new int[n][n];
        int lo=0,hi=n-1;
        int i;
        int num=1;
        while(lo<hi)
        {
            for(i=lo;i<hi;i++)
            {
                res[lo][i]=num;
                num++;
            }
            for(i=lo;i<hi;i++)
            {
                res[i][hi]=num;
                num++;
            }
            for(i=hi;i>lo;i--)
            {
                res[hi][i]=num;
                num++;
            }
            for(i=hi;i>lo;i--)
            {
                res[i][lo]=num;
                num++;
            }
            lo++;
            hi--;
        }
        if(n%2==1)
            res[n/2][n/2]=num;
        return res;
    }
}