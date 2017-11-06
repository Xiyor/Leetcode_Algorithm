public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int dp[]=new int[nums.length];
        dp[0]=1;
        int j;
        int res=1;
        for(int i=1;i<dp.length;i++)
        {
            j=i-1;
            dp[i]=1;
            while(j>=0)
            {
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
                j--;
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}