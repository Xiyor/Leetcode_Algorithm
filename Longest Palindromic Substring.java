public class Solution {
    public String longestPalindrome(String s) {
        if(s==null)
            return null;
        int maxLen=0;
        String res=null;
        for(int i=0;i<s.length();i++)
        {
            String s1=helper(s,i,i);
            if(s1.length()>maxLen)
            {
                maxLen=s1.length();
                res=s1;
            }
            String s2=helper(s,i,i+1);
            if(s2.length()>maxLen)
            {
                maxLen=s2.length();
                res=s2;
            }
        }
        return res;
    }
    String helper(String s,int i,int j)
    {
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}