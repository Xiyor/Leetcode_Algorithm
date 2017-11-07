public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> storage=new HashMap<Character,Integer>();
        int i;
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!storage.containsKey(c))
                storage.put(c,1);
            else
                storage.put(c,storage.get(c)+1);
        }
        for(i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(!storage.containsKey(c)||storage.get(c)==0)
                return false;
            else
                storage.put(c,storage.get(c)-1);
        }
        return true;
    }
}