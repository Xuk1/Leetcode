class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                ret[0] = i;
                break;
            }
        }
        if(ret[0] == -1){
            return ret;
        }
        for(int i = ret[0]; i < n; i++){
            if(nums[i] == target){
                ret[1] = i;
            }
        }
        return ret;
    }
}

/*
执行用时: 1 ms
内存消耗: 41.6 MB
*/
