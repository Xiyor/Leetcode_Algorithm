public class Solution {
    public int maxArea(int[] height) {
        int lo=0,hi=height.length-1;
        int preHeight=0,high=0,width,area=0;
        while(lo<hi)
        {
            while(lo<hi&&height[lo]<=preHeight)
            {
                lo++;
            }
            while(lo<hi&&height[hi]<=preHeight)
            {
                hi--;
            }
            if(lo>=hi)
                break;
            high=Math.min(height[lo],height[hi]);
            if(high>preHeight)
            {
                width=hi-lo;
                area=Math.max(area,high*width);
                preHeight=high;
            }
        }
        return area;
    }
}