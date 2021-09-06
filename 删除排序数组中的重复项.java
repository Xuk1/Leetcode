class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 1;
        for( ; right < nums.length; right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right++];
            }
        }
        return ++left;
    }
}

/*
使用双指针
*/
