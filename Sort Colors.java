public class Solution {
    public void sortColors(int[] nums) {
        int red_count=0,white_count=0,blue_count=0;
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                red_count++;
            else
                if(nums[i]==1)
                    white_count++;
                else
                    blue_count++;
        }
        i=0;
        int j=i;
        for(;i<j+red_count;i++)
        {
            nums[i]=0;
        }
        j=i;
        for(;i<j+white_count;i++)
        {
            nums[i]=1;
        }
        j=i;
        for(;i<j+blue_count;i++)
        {
            nums[i]=2;
        }
    }
}