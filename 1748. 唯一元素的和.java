class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ret += entry.getKey();
            }
        }
        return ret;
    }
}

/*
执行用时:1 ms，在所有Java提交中击败了 55.82%的用户
内存消耗:39.3 MB ，在所有Java提交中击败了 5.13%的用户
*/
