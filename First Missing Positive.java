public class Solution {
    public int firstMissingPositive(int[] nums) {
         int len=nums.length,temp,i;
        for(i=0;i<len;i++)
        {
            while(nums[i]!=i+1)
            {
                if(nums[i]-1<0||nums[i]-1>=len||nums[i]==nums[nums[i]-1])
                    break;
                temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
        }
        for(i=0;i<len;i++)
        {
            if(nums[i]!=i+1)
                return i+1;
        }
        return len+1;
    }
}