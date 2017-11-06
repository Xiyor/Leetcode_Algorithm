public class Solution {
    public boolean isValidSerialization(String preorder) {
       String[] arr=preorder.split(",");
        String[] rec=new String[arr.length];
        int i=-1;
        for(int j=0;j<arr.length;j++)
        {
            rec[++i]=arr[j];
            while(i>=2&&rec[i].equals("#")&&rec[i-1].equals("#")&&!rec[i-2].equals("#"))
            {
                rec[i-2]="#";
                i-=2;
            }
        }
        return i==0&&rec[0].equals("#");
    }
}