public class Solution {
    public double myPow(double x, int n) {
        if(n<0)
            return 1.0/x/myPow(x,-n-1);
        if(n==0)
            return 1;
        double t=myPow(x,n/2);
        if(n%2==0)
            return t*t;
        else
            return t*t*x;
    }
}