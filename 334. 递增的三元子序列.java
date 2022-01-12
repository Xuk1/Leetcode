class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return false;
        }
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        leftMin[0] = nums[0];
        for(int i = 1; i < n; i++){                         //存储到i为止左边最小的数值
            leftMin[i] = Math.min(leftMin[i-1], nums[i]);
        }  
        rightMax[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){                      //存储到i为止右边最大的数值
            rightMax[i] = Math.max(rightMax[i+1], nums[i]);
        }
        for(int i = 1; i < n-1; i++){
            if(nums[i] > leftMin[i] && nums[i] < rightMax[i]){
                return true;
            }
        }
        return false;
    }
}

/*
执行用时: 5 ms ，在所有Java提交中击败了10.29%的用户
内存消耗:79.1 MB，在所有Java提交中击败了39.04%的用户

思路
因为要寻找递增的三元子序列，并且题目中没有要求必须是连续的递增。这就增加了难度，因为不同的中间值就可以满足不同的递增三元子序列。
就想到了可以存储不同i的左边最小值 和 右边最大值。也就是存储 到i为止左边最小的值 和 到i为止右边最大的值，这样就可以保证下标在左右值下标之间的数可以快速与左边所有值和右边所有值比较大小。

感悟
在这样不需要连续比较大小的时候，都可以采用这种方法
*/
