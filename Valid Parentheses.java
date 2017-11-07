public class Solution {
    public boolean isValid(String s) {
        Stack<Character> storage=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(storage.isEmpty())
            {
                storage.push(s.charAt(i));
            }
            else
            {
                if(matchs(storage.peek(),s.charAt(i)))
                {
                    storage.pop();
                }
                else
                {
                    storage.push(s.charAt(i));
                }
            }
        }
        if(storage.isEmpty())
            return true;
        else
            return false;
    }
    boolean matchs(char a,char b)
    {
        if(a=='('&&b==')')
            return true;
        if(a=='{'&&b=='}')
            return true;
        if(a=='['&&b==']')
            return true;
        return false;
    }
}