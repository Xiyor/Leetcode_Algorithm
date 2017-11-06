public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<List<Integer>> res=new LinkedList<List<Integer>>();
        res.offer(new LinkedList<>());
        int size,cur=0;
        while(cur<nums.length)
        {
            size=res.size();
            Set<List<Integer>> storage=new HashSet<List<Integer>>();
            for(int i=0;i<size;i++)
            {
                List<Integer> temp=res.poll();
                for(int j=0;j<=temp.size();j++)
                {
                    temp.add(j,nums[cur]);
                    if(!storage.contains(temp))
                    {
                        storage.add(new ArrayList<Integer>(temp));
                        res.offer(new ArrayList<Integer>(temp));
                    }
                    temp.remove(j);
                }
            }
            cur++;
        }
        return res;
    }
}