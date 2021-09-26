class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            a = a^b;
            b = carry;
        }
        return a;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:34.8 MB ，在所有Java提交中击败了96.16%的用户

位运算
可以发现，对于整数 a 和 b：
在不考虑进位的情况下，其无进位加法结果为 a⊕b。
而所有需要进位的位为 a & b，进位后的进位结果为 (a & b) << 1。
*/
