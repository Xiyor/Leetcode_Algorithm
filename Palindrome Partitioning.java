public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<List<String>>();
        helper(res,new ArrayList<String>(),s,0);
        return res;
    }
    void helper(List<List<String>> res,List<String> temp,String s,int start)
    {
        if(start==s.length())
            res.add(new ArrayList<String>(temp));
        for(int i=start;i<s.length();i++)
        {
            if(isPalindrome(s.substring(start,i+1)))
            {
                temp.add(s.substring(start,i+1));
                helper(res,temp,s,i+1);
                temp.remove(temp.size()-1);
            }
            else
                continue;
        }
    }
    boolean isPalindrome(String s)
    {
        int lo=0,hi=s.length()-1;
        while(lo<hi)
        {
            if(s.charAt(lo)!=s.charAt(hi))
                return false;
            lo++;
            hi--;
        }
        return true;
    }
}