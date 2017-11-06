public class Solution {
    public boolean isMatch(String s, String p) {
        int sl=s.length(),pl=p.length();
        boolean dp[][]=new boolean[pl+1][sl+1];
        dp[0][0]=true;
        boolean flag;
        for(int i=1;i<=pl;i++)
        {
            flag=false;
            for(int j=0;j<=sl;j++)
            {
                flag=flag||dp[i-1][j];
                if(p.charAt(i-1)!='*')
                    dp[i][j]=j>0&&dp[i-1][j-1]&&(p.charAt(i-1)=='?'||s.charAt(j-1)==p.charAt(i-1));
                else
                {
                    dp[i][j]=i==1||flag;
                }
            }
        }
        return dp[pl][sl];
    }
}