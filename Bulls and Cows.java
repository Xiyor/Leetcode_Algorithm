public class Solution {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        int numBulls=0,numTotal=0;
        for(int i=0;i<secret.length();i++)
        {
            char s=secret.charAt(i);
            if(s==guess.charAt(i))
                numBulls++;
            if(m.containsKey(s))
                m.put(s,m.get(s)+1);
            else
                m.put(s,1);
        }
        for(int i=0;i<guess.length();i++)
        {
            if(m.containsKey(guess.charAt(i))&&m.get(guess.charAt(i))>=1)
            {
                m.put(guess.charAt(i),m.get(guess.charAt(i))-1);
                numTotal++;
            }
        }
        return numBulls+"A"+(numTotal-numBulls)+"B";
    }
}