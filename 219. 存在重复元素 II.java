class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                int j = map.get(nums[i]);
                if(Math.abs(i - j) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}

/*
执行用时:23 ms ,在所有Java提交中击败了 29.63%的用户
内存消耗:47.3 MB，在所有Java提交中击败了82.37%的用户
*/
