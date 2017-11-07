public class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int res=nums[0];
        int up[]=new int[nums.length];
        up[0]=nums[0];
        int down[]=new int[nums.length];
        down[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            up[i]=Math.max(Math.max(up[i-1]*nums[i],down[i-1]*nums[i]),nums[i]);
            down[i]=Math.min(Math.min(up[i-1]*nums[i],down[i-1]*nums[i]),nums[i]);
            res=Math.max(res,up[i]);
        }
        return res;
    }
}