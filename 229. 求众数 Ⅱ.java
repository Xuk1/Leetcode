class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                ret.add(entry.getKey());
            }
        }
        return ret;
    }
}

/*
执行用时: 14ms，在所有Java提交中击败了8.84%的用户
内存消耗:41.6 MB，在所有Java提交中击败了83.44%的用户
*/
