public class Solution {
    public int maxSubArray(int[] nums) {
        int res=Integer.MIN_VALUE,curSum=0;
        for(int i=0;i<nums.length;i++)
        {
            curSum+=nums[i];
            res=Math.max(res,curSum);
            if(curSum<0)
            {
                curSum=0;
            }
        }
        return res;
    }
}