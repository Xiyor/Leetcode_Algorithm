public class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> storage=new LinkedList<Integer>();
        int over=1,digit;
        for(int i=digits.length-1;i>=0;i--)
        {
            storage.addFirst((digits[i]+over)%10);
            over=(digits[i]+over)/10;
        }
        if(over==1)
            storage.addFirst(1);
        int res[]=new int[storage.size()];
        for(int i=0;i<storage.size();i++)
        {
            res[i]=storage.get(i);
        }
        return res;
    }
}