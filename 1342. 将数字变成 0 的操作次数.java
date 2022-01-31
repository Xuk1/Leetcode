class Solution {
    public int numberOfSteps(int num) {
        int ret = 0;
        if (num == 0){
            return ret;
        }
        while (num > 0){
            if (num % 2 == 0){
                num /= 2;
            }else {
                num -= 1;
            }
            ret++;
        }
        return ret;
    }
}

/*
执行用时:0 ms ，在所有Java提交中击败了100.00%的用户
内存消耗:38 MB，在所有Java提交中击败了 6.55%的用户
*/
