class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;                //存储所有衣服的数量
        int n = machines.length;
        for(int i : machines){
            sum += i;
        }

        if(sum % n != 0){           //如果不能使每台洗衣机中衣物的数量相等，则返回-1
            return -1;
        }

        int ave = sum / n;          //每台洗衣机应该有的平均衣物数量
        int res = 0;
        int num = 0;
        for(int i : machines){
            i -= ave;
            num += i;
            res = Math.max(res, Math.max(Math.abs(num), i));
        }
        return res;
    }
}

/*
执行用时: 1 ms ,在所有Java提交中击败了87.24%的用户
内存消耗:39.3 MB，在所有Java提交中击败了 5.10%的用户
*/
