class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int i=0; i<position.length; i++){
            if(position[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}

/*
执行用时: 0 ms ,在所有Java提交中击败了100.00%的用户
内存消耗:35.9 MB，在所有Java提交中击败了 58.46%的用户

题目的意思是：奇数位置到奇数位置/偶数位置到偶数位置-代价为0；奇数位置到偶数位置/偶数位置到奇数位置-代价为1
所以只需要统计在奇/偶数位置的筹码个数，返回更少的那个就可以了
*/
