class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        int ret = 0;
        for(int i=0; i<n; i++){
            min = min > nums[i]? nums[i]: min;
        }
        for(int i=0; i<n; i++){
            ret = ret + nums[i] - min;
        }
        return ret;
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:39.1 MB，在所有Java提交中击败了 7.07%的用户

因为只需要找出让数组所有元素相等的最小操作次数，所以我们不需要考虑数组中各个元素的绝对大小，即不需要真正算出数组中所有元素相等时的元素值，只需要考虑数组中元素相对大小的变化即可。
因此，每次操作既可以理解为使 n-1 个元素增加 1，也可以理解使 1 个元素减少 1。显然，后者更利于我们的计算。
于是，要计算让数组中所有元素相等的操作数，我们只需要计算将数组中所有元素都减少到数组中元素最小值所需的操作数
*/
