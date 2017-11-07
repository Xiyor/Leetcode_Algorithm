public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int record[]=new int[prices.length-1];
        for(int i=0;i<record.length;i++)
            record[i]=prices[i+1]-prices[i];
        int res=0,curSum=0;
        for(int i=0;i<record.length;i++)
        {
            curSum+=record[i];
            if(curSum<0)
                curSum=0;
            res=Math.max(res,curSum);
        }
        return res;
    }
}