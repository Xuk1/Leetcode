class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        nums[index] = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] * 2 > max){
                return -1;
            }
        }
        return index;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:36.1 MB ，在所有Java提交中击败了 68.25%的用户
*/
