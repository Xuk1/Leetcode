class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ret = new ArrayList<>();
        if(n < 3){
            return ret;
        }
        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int k = n-1;

            for(int j=i+1; j<n-1; j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                while(k > j && nums[k] + nums[j] > -nums[i]){
                    k--;
                }
                if(j == k){
                    break;
                }
                if(nums[j] + nums[k] == -nums[i]){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ret.add(list);
                }
            }
        }
        return ret;
    }
}

/*
执行用时: 22 ms，在所有Java提交中击败了 54.99%的用户
内存消耗:42.6 MB，在所有Java提交中击败了31.89%的用户

双指针
*/
