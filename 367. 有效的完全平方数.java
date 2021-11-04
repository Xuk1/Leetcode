class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        return x*x == num;
    }
}

/*
执行用时: 0 ms，在所有Java提交中击败了100.00%的用户
内存消耗:35.3 MB，在所有Java提交中击败了10.11%的用户
*/
