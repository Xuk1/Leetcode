class Solution {
    public int arrangeCoins(int n) {
        int count = 1;
        while(n - count >= 0){
            n = n - count;
            count++;
        }
        return count-1;
    }
}

/*
执行用时: 6 ms ,在所有Java提交中击败了43.97%的用户
内存消耗:35.7 MB ，在所有Java提交中击败了18.06%的用户
*/
