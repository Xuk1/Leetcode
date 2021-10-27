class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = (left + right) / 2 ;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[0] <= nums[mid]){
                if(nums[0] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[nums.length-1]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*
执行用时:0ms ,在所有Java提交中击败了100.00%的用户
内存消耗:37.9 MB，在所有Java提交中击败了14.79%的用户

使用二分查找方法，注意边界的选取和二分查找指针移动的条件
*/
