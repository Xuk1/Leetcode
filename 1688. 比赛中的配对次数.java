class Solution {
    int nums = 0;
    public int numberOfMatches(int n) {
        if(n == 1){
            return nums;
        }
        if(n % 2 == 0){
            nums += n / 2;
            n = n / 2;
        }
        if(n % 2 != 0){
            nums += (n-1)/2;
            n = (n-1)/2 + 1;
        }
        return numberOfMatches(n);
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:38.8 MB ，在所有Java提交中击败了 5.01%的用户

递归
*/
