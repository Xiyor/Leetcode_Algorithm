public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0,tempSum=0;
        int j=-1;
        for(int i=0;i<gas.length;i++)
        {
            tempSum+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(tempSum<0)
            {
                tempSum=0;
                j=i;
            }
        }
        return sum>=0?j+1:-1;
    }
}