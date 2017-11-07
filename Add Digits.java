public class Solution {
    public int addDigits(int num) {
        if(num==0)
            return 0;
        int t=num%9;
        return t==0?9:t;
    }
}