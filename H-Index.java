public class Solution {
    public int hIndex(int[] citations) {
         int record[]=new int[citations.length+1];
         for(int i=0;i<citations.length;i++)
         {
             if(citations[i]>=citations.length)
                 record[citations.length]++;
            else
                 record[citations[i]]++;
         }
         int tot=0;
         for(int i=record.length-1;i>=0;i--)
         {
             tot+=record[i];
             if(tot>=i)
                 return i;
         }
         return 0;
    }
}