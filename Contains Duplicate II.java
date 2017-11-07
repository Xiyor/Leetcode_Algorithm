public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!m.containsKey(nums[i]))
                m.put(nums[i],i);
            else
            {
                if(i-m.get(nums[i])<=k)
                    return true;
                else
                    m.put(nums[i],i);
            }
        }
        return false;
    }
}