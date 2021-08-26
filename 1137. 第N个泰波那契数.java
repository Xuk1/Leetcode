class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }else if(n > 0 && n < 3){
            return 1;
        }

        int a = 0;
        int b = 0;
        int c = 1;
        int res = 1;
        for(int i = 3; i < n+1; ++i){
            a = b;
            b = c;
            c = res;
            res = a + b + c;
        }
        return res;
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:35.3 MB ，在所有Java提交中击败了 11.17%的用户
*/
