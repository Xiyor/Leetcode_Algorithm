public class Solution {
    public int trap(int[] height) {
        if(height.length<=2)
            return 0;
        int leftMax[]=new int [height.length];
        int rightMax[]=new int [height.length];
        for(int i=1;i<height.length;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
            rightMax[height.length-1-i]=Math.max(rightMax[height.length-i],height[height.length-i]);
        }
        int water=0;
        for(int i=1;i<height.length-1;i++)
        {
            if(Math.min(leftMax[i],rightMax[i])>height[i])
            {
                water+=Math.min(leftMax[i],rightMax[i])-height[i];
            }
        }
        return water;
    }
}