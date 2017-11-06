public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null)
            return;
        int i=0,j=0;
        for(;i<nums.length;i++)
        {
            while(i<nums.length&&nums[i]==0)
            {
                i++;
            }
            if(i<nums.length)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length)
        {
            nums[j]=0;
            j++;
        }
    }
}