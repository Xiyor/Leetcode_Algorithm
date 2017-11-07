public class Solution {
    public int numSquares(int n) {
        List<Integer> storage=new ArrayList<Integer>();
        storage.add(0);
        int dp[]=new int[n+1];
        for(int i=1;i<=n;i++)
            dp[i]=calculateDpValue(i,dp,storage);
        return dp[n];
    }
    int calculateDpValue(int n,int dp[],List<Integer> storage)
    {
        int res=Integer.MAX_VALUE;
        int nextNum=(storage.size())*(storage.size());
        if(n>=nextNum)
            storage.add(nextNum);
        for(int i=1;i<storage.size();i++)
            res=Math.min(dp[n-storage.get(i)],res);
        return ++res;
    }
}