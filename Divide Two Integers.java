public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0||dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        long pDividend=Math.abs((long)dividend);
        long pDivisor=Math.abs((long)divisor);
        int numshift;
        int res=0;
        while(pDividend>=pDivisor)
        {
            numshift=0;
            while(pDividend>=(pDivisor<<numshift))
            {
                numshift++;
            }
            res+=1<<numshift-1;
            pDividend-=pDivisor<<(numshift-1);
        }
        if(dividend<0&&divisor>0||dividend>0&&divisor<0)
            return -res;
        else
            return res;
    }
}