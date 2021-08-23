class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+1];
        nums[0] = 0;
        int max = 1;

        if(n<1){
            return 0;
        }else if(n == 1){
            nums[1] = 1;
            return 1;
        }else{
            nums[1] = 1;
            for(int i=2; i<n+1; i++){
                if(i%2 == 0){
                    nums[i] = nums[i/2];
                }else{
                    int tmp = i/2;
                    nums[i] = nums[tmp] + nums[tmp+1];
                }
            }
            for(int i=0; i<n+1; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
            return max;
        }
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:34.9 MB ，在所有Java提交中击败了93.71%的用户

需要注意数组长度n=0的情况，此时无法初始化nums[1]
*/
