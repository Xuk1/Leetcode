class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tmp = new int[len];
        for(int i=0; i<len; i++){
            tmp[i] = nums[i];
        }
        for(int i=0; i<len; i++){
            nums[(i+k)%len] = tmp[i];
        }
    }
}

/*
执行用时: 1 ms ，在所有Java提交中击败了 62.60%的用户
内存消耗:54.9 MB，在所有Java提交中击败了92.90%的用户

使用临时数组，新下标的计算很巧妙
*/
