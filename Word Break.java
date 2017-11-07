public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int i=0,len=s.length(),pre=0;
        Stack<Integer> storage=new Stack<Integer>();
        storage.push(pre);
        while(!wordDict.contains(s.substring(pre,len)))
        {
            if(pre==len-1&&!wordDict.contains(s.substring(pre,len)))
                return false;
            if(i+1<=len&&wordDict.contains(s.substring(pre,i+1)))
            {
                storage.push(i);
                i++;
                pre=i;
            }
            else
            {
                if(i<len)
                    i++;
                else
                {
                    if(storage.isEmpty())
                        return false;
                    i=storage.pop()+1;
                    if(storage.isEmpty())
                        return false;
                    pre=storage.peek();
                }
            }
        }
        return true;
    }
}