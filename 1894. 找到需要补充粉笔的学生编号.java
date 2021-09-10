class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;              //一轮下来学生要用的粉笔总数，可能数字很大所以用long型
        int res = 0;               //需要补充粉笔的学生编号
        for(int num : chalk){
            total += num;
        }
        k %= total;                 //倒数第二轮后还剩下的粉笔数
        for(int i=0; i<chalk.length; i++){
            if(chalk[i] > k){
                res = i;
                break;
            }
            k -= chalk[i];
        }
        return res;
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了99.90%的用户
内存消耗:54.5 MB，在所有Java提交中击败了 17.80%的用户
*/
