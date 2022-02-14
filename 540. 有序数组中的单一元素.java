class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int ret = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ret = entry.getKey();
            }
        }
        return ret;
    }
}

/*
执行用时:13 ms，在所有Java提交中击败了22.98%的用户
内存消耗:51.7 MB ，在所有Java提交中击败了 5.10%的用户
*/
