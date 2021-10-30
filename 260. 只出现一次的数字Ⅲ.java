class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ret = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ret[cnt] = entry.getKey();
                cnt++;
            }
        }
        return ret;
    }
}

/*
执行用时: 6 ms ,在所有Java提交中击败了10.85%的用户
内存消耗:39.8 MB，在所有Java提交中击败了 5.04%的用户

哈希表
*/
