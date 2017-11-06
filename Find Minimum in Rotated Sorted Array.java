public class Solution {
    public int findMin(int[] nums) {
        int lo=0,hi=nums.length-1,mid=(lo+hi)/2;
        while(lo<hi)
        {
            if(nums[mid]>nums[hi])
                lo=mid+1;
            else
            {
                if(nums[mid]>nums[mid+1])
                    return nums[mid+1];
                hi=mid;
            }
            mid=(lo+hi)/2;
        }
        return nums[mid];
    }
}