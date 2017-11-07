public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<String>();
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits==null||digits.length()==0)
            return res;
        dfs(res,map,digits,0);
        return res;
    }
    StringBuilder word=new StringBuilder();
    void dfs(List<String> res,String[] map,String digits,int cur)
    {
        if(cur==digits.length())
        {
            res.add(word.toString());
            return;
        }
        for(int i=0;i<map[digits.charAt(cur)-'0'].length();i++)
        {
            word.append(map[digits.charAt(cur)-'0'].charAt(i));
            dfs(res,map,digits,cur+1);
            word.deleteCharAt(word.length()-1);
        }
    }
}

