public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a=shareLen(A,C,E,G);
        int b=shareLen(B,D,F,H);
        return area(A,B,C,D)+area(E,F,G,H)-a*b;
    }
    int shareLen(int s1,int e1,int s2,int e2)
    {
        if(e1>s2&&e2>s1)
            return Math.min(e1,e2)-Math.max(s1,s2);
        return 0;
    }
    int area(int a,int b,int c,int d)
    {
        return Math.abs((c-a)*(d-b));
    }
}