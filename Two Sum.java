public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> storage=new HashMap<Integer,Integer>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(!storage.containsKey(nums[i]))
            {
                storage.put(target-nums[i],i);
            }
            else
            {
                res[0]=storage.get(nums[i])+1;
                res[1]=i+1;
                break;
            }
        }
        return res;
    } 
}