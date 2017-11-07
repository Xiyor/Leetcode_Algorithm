public class Solution {
    public int removeDuplicates(int[] nums) {
        int cur=1,count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[cur++]=nums[i];
                count=1;
            }
            else
            {
                if(count<2)
                {
                    nums[cur++]=nums[i];
                    count++;
                }
            }
        }
        return cur;
    }
}