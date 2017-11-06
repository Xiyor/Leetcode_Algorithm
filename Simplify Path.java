public class Solution {
    public String simplifyPath(String path) {
        return helper(path);
    }
    String helper(String s)
    {
        LinkedList<String> st=new LinkedList<String>();
        String res="";
        int lo=0;
        int hi=0;
        for(int i=0;i<s.length();i++)
        {
            while(i<s.length()&&s.charAt(i)=='/')
            {
                i++;
            }
            if(i==s.length())
                break;
            lo=i;
            while(i<s.length()&&s.charAt(i)!='/')
            {
                i++;
            }
            hi=i;
            String cur=s.substring(lo,hi);
            if(cur.equals("."))
                continue;
            else
                if(cur.equals(".."))
                {
                    if(!st.isEmpty())
                       st.pop();
                }
                else
                    st.push(cur);
        }
        while(!st.isEmpty())
        {
            res="/"+st.pop()+res;
        }
        return res.equals("")?"/":res;
    }
}