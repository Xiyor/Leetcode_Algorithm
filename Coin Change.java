public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0)
            return 0;
        int numCoins=coins.length;
        int record[]=new int[numCoins];
        int dp[]=new int[amount+1];
        for(int i=1;i<=amount;i++)
        {
            dp[i]=findValue(i,coins,record,dp);
        }
        return dp[amount]==0?-1:dp[amount];
    }
    int findValue(int money,int coins[],int record[],int dp[])
    {
        for(int i=0;i<coins.length;i++)
        {
            if(money-coins[i]<0)
                record[i]=0;
            else
            if(money-coins[i]!=0&&dp[money-coins[i]]==0)
                record[i]=0;
            else
                record[i]=dp[money-coins[i]]+1;
        }
        int min=Integer.MAX_VALUE,flag=-1;
        for(int i=0;i<record.length;i++)
        {
            if(record[i]==0)
                continue;
            if(min>=record[i])
            {
                min=record[i];
                flag=1;
            }
        }
        return flag==1?min:0;
    }
}