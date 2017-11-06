public class Solution {
    public boolean isMatch(String s, String p) {
        int slen=s.length(),plen=p.length();
        boolean dp[][]=new boolean[slen+1][plen+1];
        dp[0][0]=true;
        char pc;
        for(int s_index=0;s_index<=slen;s_index++)
        {
            for(int p_index=1;p_index<=plen;p_index++)
            {
                pc=p.charAt(p_index-1);
                if(pc!='*')
                {
                    dp[s_index][p_index]=s_index>=1&&dp[s_index-1][p_index-1]&&(pc=='.'||pc==s.charAt(s_index-1));
                }
                else
                {
                    dp[s_index][p_index]=p_index>1&&dp[s_index][p_index-2]||
                    s_index>0&&dp[s_index-1][p_index]&&(p.charAt(p_index-2)=='.'||p.charAt(p_index-2)==s.charAt(s_index-1));
                }
            }
        }
        return dp[slen][plen];
    }
}