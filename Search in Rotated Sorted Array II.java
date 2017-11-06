public class Solution {
    public boolean search(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        while(left<=right)
        {
            while(left!=right&&nums[left]==nums[right])
            {
                right--;
            }
            mid=left+(right-left)/2;
            if(target==nums[mid])
                return true;
            
            if(nums[mid]>=nums[left])
            {
                if(target>=nums[left]&&target<nums[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(target>nums[mid]&&target<=nums[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return false;
    }
}