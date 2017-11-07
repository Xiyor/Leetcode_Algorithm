public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new LinkedList<List<String>>();
        if(strs==null||strs.length==0)
            return res;
        Arrays.sort(strs);
        Map<String,List<String>> storage=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++)
        {
            char tt[]=strs[i].toCharArray();
            Arrays.sort(tt);
            if(!storage.containsKey(String.valueOf(tt)))
                storage.put(String.valueOf(tt),new LinkedList());
            storage.get(String.valueOf(tt)).add(strs[i]);
        }
        return new ArrayList<List<String>>(storage.values());
    }
}