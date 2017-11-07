public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[]=new int[triangle.size()];
        for(int i=0;i<dp.length;i++)
            dp[i]=triangle.get(triangle.size()-1).get(i);
        int bound=dp.length-1;
        while(bound>0)
        {
            for(int i=0;i<bound;i++)
                dp[i]=Math.min(dp[i],dp[i+1])+triangle.get(bound-1).get(i);
            bound--;
        }
        return dp[0];
    }
}