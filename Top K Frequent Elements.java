public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res=new ArrayList<Integer>();
        Map<Integer,Integer> st=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.isEmpty()||!st.containsKey(nums[i]))
                st.put(nums[i],1);
            else
                st.put(nums[i],st.get(nums[i])+1);
        }
        List<Integer>[] bullet=new List[nums.length+1];
        Iterator<Integer> it=st.keySet().iterator();
        while(it.hasNext())
        {
            Integer cur=it.next();
            if(bullet[st.get(cur)]==null)
                bullet[st.get(cur)]=new ArrayList<Integer>();
            bullet[st.get(cur)].add(cur);
        }
        for(int i=nums.length;i>=0;i--)
        {
            if(bullet[i]!=null)
                res.addAll(bullet[i]);
            if(res.size()==k)
                break;
        }
        return res;
    }
}