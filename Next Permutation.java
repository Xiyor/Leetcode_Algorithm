public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)
            return;
        int i,j;
        for(i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
                break;
        }
        int temp;
        if(i!=-1)
        {
            for(j=nums.length-1;j>i;j--)
            {
                if(nums[j]>nums[i])
                    break;
            }
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int left=i+1,right=nums.length-1;
        while(left<right)
        {
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}