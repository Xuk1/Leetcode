class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        Arrays.fill(sum, 0);
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                sum[i] += nums[j];
            }
        }
        return sum;
    }
}

/*
执行用时:5 ms ,在所有Java提交中击败了7.14%的用户
内存消耗:38.6 MB ，在所有Java提交中击败了40.22%的用户
*/
