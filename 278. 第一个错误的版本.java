/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}

/*
执行用时:11 ms ，在所有Java提交中击败了99.93%的用户
内存消耗:35 MB，在所有Java提交中击败了 73.13%的用户

在有序的元素查找中可以使用二分查找加快查找速度，但是要注意边界问题
*/
