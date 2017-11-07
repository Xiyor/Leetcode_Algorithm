public class Solution {
    public int longestValidParentheses(String s) {
        int res=0,start=-1;
        LinkedList<Integer> storage=new LinkedList<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                storage.push(i);
            }
            else
            {
                if(!storage.isEmpty())
                {
                    storage.pop();
                    if(!storage.isEmpty())
                    {
                        res=res>i-storage.peek()?res:i-storage.peek();
                    }
                    else
                    {
                        res=res>i-start?res:i-start;
                    }
                }
                else
                {
                    start=i;
                }
            }
        }
        return res;
    }
}