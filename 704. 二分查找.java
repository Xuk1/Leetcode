class Solution {
    public int search(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        int res = -1;
        while(min <= max){
            int s = (min + max) / 2;
            if(nums[s] == target){
                res = s;
                break;
            }else if(nums[s] < target){
                min = s + 1;
            }else if(nums[s] > target){
                max = s - 1;
            }
        }
        return res;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:39.5 MB，在所有Java提交中击败了 24.91%的用户

使用二分查找提升查找速度
二分查找适用于有序的数据查找
*/
