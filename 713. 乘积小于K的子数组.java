class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ret = 0;
        int n = nums.length;
        int product = 1;
        if(k <= 1){
            return ret;
        }
        int left = 0;                           //左指针
        for(int right=0; right<n; right++){     //循环右指针
            product *= nums[right];
            while(product >= k){                //当乘积大于等于k的时候，从左开始除以左指针所指的数值，一直到乘积小于k
                product /= nums[left++];
            }
            ret += right - left + 1;            //这样就有这么多个子数组是满足条件的
        }
        return ret;
    }
}

/*
执行用时:4ms ,在所有Java提交中击败了99.94%的用户
内存消耗:45.2 MB，在所有Java提交中击败了78.46%的用户

## 双指针
* 一个指针指向左端，用于找到使得product刚好小于K的数组元素下标；另一个指针用来滑动，用于找到使得product刚好大于等于K的数组元素下标
* 找到left和right后，这个子数组就是能小于K的最大的子数组了，于是在这个范围中的子数组的个数就是这个子数组元素的个数
*/
