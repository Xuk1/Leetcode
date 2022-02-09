class Solution {
    public int countKDifference(int[] nums, int k) {
        int ret = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    ret++;
                }
            }
        }
        return ret;
    }
}

/*
执行用时:10 ms ,在所有Java提交中击败了6.64%的用户
内存消耗:40.8 MB ，在所有Java提交中击败了 8.23%的用户
*/
