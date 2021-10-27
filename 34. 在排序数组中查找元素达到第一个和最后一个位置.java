class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ret[0] = i;
                break;
            }
        }
        for(int j=nums.length-1; j>=0; j--){
            if(nums[j] == target){
                ret[1] = j;
                break;
            }
        }
        return ret;
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了13.48%的用户
内存消耗:41.6 MB，在所有Java提交中击败了65.14%的用户
*/
