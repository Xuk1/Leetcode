class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int len = 1;
        while(len <= n){
            for(int start = 0; start + len <= n; start++){
                for(int end = start; end < start + len; end++){
                    sum = sum + arr[end];
                }
            }
            len += 2;
        }
        return sum;
    }
}

/*
执行用时：2 ms, 在所有 Java 提交中击败了44.33%的用户
内存消耗：36 MB, 在所有 Java 提交中击败了58.70%的用户
*/
