public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return helper(nums,nums.length-k,0,nums.length-1);
    }
    int helper(int[] nums,int k,int start,int end)
    {
        int key=nums[start];
        int i=start,j=end;
        while(i<j)
        {
            while(i<j&&nums[j]>=key)
                j--;
            if(i<j)
                nums[i++]=nums[j];
            while(i<j&&nums[i]<=key)
                i++;
            if(i<j)
                nums[j--]=nums[i];
        }
        nums[i]=key;
        if(i<k)
            return helper(nums,k,i+1,end);
        else
            if(i>k)
                return helper(nums,k,start,i-1);
            else
                return key;
    }
}