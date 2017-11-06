public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int leftPro=1,rightPro=1;
        for(int i=res.length-1;i>=0;i--)
        {
            res[i]=rightPro;
            rightPro*=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            res[i]*=leftPro;
            leftPro*=nums[i];
        }
        return res;
    }
}