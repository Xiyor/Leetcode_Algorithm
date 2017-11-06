public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null)
            return false;
        Set<Integer> storage=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(storage.contains(nums[i]))
                return true;
            else
                storage.add(nums[i]);
        }
        return false;
    }
}