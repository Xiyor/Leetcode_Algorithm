public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;
        int res=0,head=0;
        Map<Character,Integer> storage=new HashMap<Character,Integer>();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(!storage.containsKey(s.charAt(i))||storage.get(s.charAt(i))<head)
            {
                storage.put(s.charAt(i),i);
                res=Math.max(i-head+1,res);
            }
            else
            {
                head=storage.get(s.charAt(i))+1;
                storage.put(s.charAt(i),i);
                res=Math.max(i-head+1,res);
            }
        }
        return res;
    }
}