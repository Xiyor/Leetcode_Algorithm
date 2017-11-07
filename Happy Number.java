public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> storage=new HashSet<Integer>();
        if(n==1)
            return true;
        int temp;
        int digit;
        while(!storage.contains(n))
        {
            temp=0;
            storage.add(n);
            while(n>0)
            {
                digit=n%10;
                temp+=digit*digit;
                n=n/10;
            }
            n=temp;
            if(n==1)
                return true;
        }
        return false;
    }
}