public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String res="";
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' '&&start!=-1)
            {
                res=" "+s.substring(start,i)+res;
                start=-1;
            }
            else
                if(s.charAt(i)==' '&&start==-1)
                    continue;
                else
                    if(start==-1)
                        start=i;
                    else
                        continue;
        }
        res=s.substring(start,s.length())+res;
        return res;
    }
}