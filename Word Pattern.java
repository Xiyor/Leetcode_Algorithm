public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String storage[]=str.split(" ");
        if(pattern.length()!=storage.length)
            return false;
        Map<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(!map.containsKey(c))
            {
                if(map.containsValue(storage[i]))
                    return false;
                else
                    map.put(c,storage[i]);
            }
            else
            {
                if(!map.get(c).equals(storage[i]))
                    return false;
            }
        }
        return true;
    }
}