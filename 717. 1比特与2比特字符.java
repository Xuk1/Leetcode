class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while(i < n-1){
            i += bits[i] + 1;
        }
        return i == n-1;
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:40.8 MB ,在所有Java提交中击败了13.47%的用户

根据题意，第一种字符一定以О开头，第二种字符一定以1开头。
我们可以对 bits数组从左到右遍历。当遍历到 bits[i]时，如果bits[i]=0，说明遇到了第一种字符，将i的值增加1;如果bits[i]= 1，说明遇到了第二种字符，可以跳过bits[i＋1](注意题目保证bits一定以0结尾，所以bits[i]一定不是末尾比特，因此 bits[i＋1]必然存在)，将i的值增加2。
上述流程也说明bits的编码方式是唯一确定的，因此若遍历到i=n-1，那么说明最后一个字符一定是第一种字符。
*/
