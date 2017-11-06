public class Solution {
    public String removeDuplicateLetters(String s) {
        String res="";
        LinkedList<Character> st=new LinkedList<Character>();
        int[] cRe=new int[26];
        boolean[] isContain=new boolean[26];
        for(int i=0;i<s.length();i++)
            cRe[s.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            cRe[c-'a']--;
            if(isContain[c-'a'])
                continue;
            else
            {
                while(!st.isEmpty()&&c<st.peek()&&cRe[st.peek()-'a']>0)
                {
                    isContain[st.pop()-'a']=false;
                }
                isContain[c-'a']=true;
                st.push(c);
            }
        }
        while(!st.isEmpty())
        {
            res=String.valueOf(st.pop())+res;
        }
        return res;
    }
}