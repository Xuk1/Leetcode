class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }
}

/*
执行用时: 5 ms ,在所有Java提交中击败了34.81%的用户
内存消耗:39 MB，在所有Java提交中击败了19.68%的用户
*/
