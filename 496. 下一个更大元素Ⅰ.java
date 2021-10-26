class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] ret = new int[m];
        for(int i=0; i<m; i++){
            int cmp = nums1[i];
            int j = 0;
            while(j < n && nums2[j] != cmp){
                j++;
            }
            int k = j+1;
            while(k < n && nums2[k] <= cmp){
                k++;
            }
            ret[i] = k < n? nums2[k]: -1;
        }
        return ret;
    }
}

/*
执行用时: 6 ms ，在所有Java提交中击败了19.13%的用户
内存消耗:38.5 MB，在所有Java提交中击败了74.36%的用户

暴力破解
*/
