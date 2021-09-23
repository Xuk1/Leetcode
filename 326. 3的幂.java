class Solution {
    public boolean isPowerOfThree(int n) {
        boolean flag = true;
        if(n <= 0){
            flag = false;
        }
        while(n > 1){
            if(n % 3 != 0){
                flag = false;
                break;
            }
            n = n / 3;
        }
        return flag;
    }
}

/*
执行用时: 16 ms ，在所有Java提交中击败了38.07%的用户
内存消耗:38.3 MB ，在所有Java提交中击败了39.71%的用户
*/
