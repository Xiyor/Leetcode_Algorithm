public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int res=0;
        for(int i=1;i<prices.length;i++)
            res+=prices[i]-prices[i-1]>0?prices[i]-prices[i-1]:0;
        return res;
    }
}