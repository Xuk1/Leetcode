class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int res = 0;
        for(int i=1; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
                res = i;
            }
        }
        return res;
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:38.2 MB，在所有Java提交中击败了14.59%的用户

相当于寻找最大值
*/
