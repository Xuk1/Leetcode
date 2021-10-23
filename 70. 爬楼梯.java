class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 0, c = 1;
        for(int i=0; i<n; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:35 MB，在所有Java提交中击败了 79.45%的用户
*/
