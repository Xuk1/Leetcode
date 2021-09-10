class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = Math.abs(nums[i]) * Math.abs(nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
}

/*
执行用时:3 ms ,在所有Java提交中击败了 13.32%的用户
内存消耗:40.2 MB ，在所有Java提交中击败了62.90%的用户
*/
