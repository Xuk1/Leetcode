class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ret = n+1;
        int start = 0, end = 0;
        int sum = 0;
        while(end < n){
            sum += nums[end];
            while(sum >= target){
                ret = Math.min(ret, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ret == n+1 ? 0 : ret;
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了99.99%的用户
内存消耗:38.3 MB，在所有Java提交中击败了 72.95%的用户

双指针 + 滑动窗口
*/
