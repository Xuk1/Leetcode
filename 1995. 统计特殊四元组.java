class Solution {
    public int countQuadruplets(int[] nums) {
        int ret = 0;
        int n = nums.length;
        Map<Integer, Integer> cnt = new HashMap<>();                        //用于存储nums[d]
        for(int c = n-2; c >= 2; c--){                                      //d的位置是相对于c而言的，只要d>=c+1都可以，所以先用c+1存储nums[d]的值
            cnt.put(nums[c+1], cnt.getOrDefault(nums[c+1], 0) + 1);         //存储nums[d]以及出现的个数
            for(int a = 0; a < c; a++){
                for(int b = a+1; b < c; b++){
                    ret += cnt.getOrDefault(nums[a]+nums[b]+nums[c], 0);    //当cnt中出现了nums[a]+nums[b]+nums[c]，也就是nums[a]+nums[b]+nums[c]==nums[d]的时候，取出个数并+1
                }
            }
        }
        return ret;
    }
}

/*
执行用时:23 ms ,在所有Java提交中击败了13.18%的用户
内存消耗:38.3 MB ，在所有Java提交中击败了5.15%的用户

### 思路
- 可以用三重循环，也可以用哈希表
### 感悟
- 遇到需要比较的并且会遇上重复值的，可以使用哈希表
*/
