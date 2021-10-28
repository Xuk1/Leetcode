class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] < nums[high]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return nums[low];
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:37.9 MB，在所有Java提交中击败了33.30%的用户

二分查找
*/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n-1;
        while(low < high){
            if(nums[low] < nums[high]){
                return nums[low];
            }else{
                low++;
            }
        }
        return nums[low];
    }
}

/*
执行用时: 0ms ,在所有Java提交中击败了100.00%的用户
内存消耗:37.8 MB，在所有Java提交中击败了55.59%的用户
*/
