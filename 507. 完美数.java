class Solution {
    public boolean checkPerfectNumber(int num) {
        int sqr = (int)Math.sqrt(num);
        int sum = 1;
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= sqr; i++){
            if(num % i == 0){
                sum += i;
                sum += num/i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了92.45%的用户
内存消耗:35 MB ，在所有Java提交中击败了80.11%的用户

寻找完美数，主要是找这个数的正因子。因为正因子都是成对出现的，所以只需要寻找到这个数的平方根，就能找完所有的正因子
在跟数学有关的题目中，需要寻找简单的解法，降低计算复杂度
*/
