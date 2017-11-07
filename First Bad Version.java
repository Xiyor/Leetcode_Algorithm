/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1,hi=n;
        int mi=lo+(hi-lo)/2;
        while(lo<hi)
        {
            if(!isBadVersion(mi))
            {
                lo=mi+1;
            }
            else
                hi=mi;
            mi=lo+(hi-lo)/2;
        }
        return mi;
    }
}