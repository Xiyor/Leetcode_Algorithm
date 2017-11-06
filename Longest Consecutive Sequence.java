public class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> storage=new HashMap<Integer,Boolean>();
        for(int ii:nums)
        {
            storage.put(ii,false);
        }
        int j,length,res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(storage.get(nums[i]))
                continue;
            else
            {
                storage.put(nums[i],true);
                length=1;
                for(j=nums[i]+1;storage.containsKey(j);j++)
                {
                    length++;
                    storage.put(j,true);
                }
                for(j=nums[i]-1;storage.containsKey(j);j--)
                {
                    length++;
                    storage.put(j,true);
                }
            }
            res=res>length?res:length;
        }
        return res;
    }
}