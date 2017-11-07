public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        helper(res,"",n,n);
        return res;
    }
    void helper(List<String> res,String sub,int left,int right)
    {
        if(left==0&&right==0)
            res.add(sub);
        if(left>0)
            helper(res,sub+"(",left-1,right);
        if(left<right)
            helper(res,sub+")",left,right-1);
    }
}