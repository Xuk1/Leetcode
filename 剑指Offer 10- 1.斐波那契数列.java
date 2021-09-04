class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1 && n == 2){
            return 1;
        }
        for(int i=2; i<n; i++){
            a = b;
            b = c;
            c = (a + b) % 1000000007;
        }
        return c;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:35.3 MB ，在所有Java提交中击败了32.12%的用户

对于c，每次都取余 和 计算到要返回的时候再取余（可能会因为使用的是int类型而造成精度的损失） 得到的最后结果是不同的
*/
