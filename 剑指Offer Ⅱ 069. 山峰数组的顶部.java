class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        int ret = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                ret = i;
            }
        }
        return ret;
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了10.88%的用户
内存消耗:38.6 MB，在所有Java提交中击败了 56.58%的用户

因为只用返回一个值，所以就直接找最大的
如果需要返回多个山峰值，就需要保证趋势
*/
