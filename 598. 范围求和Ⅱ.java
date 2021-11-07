class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minM = m, minN = n;
        for(int[] op : ops){
            minM = Math.min(minM, op[0]);
            minN = Math.min(minN, op[1]);
        }
        return minM * minN;
    }
}

/* 要求经过操作后最大的数的个数就是找经历过最多次操作的数的个数，也就是所有操作都经历过的数 */

/*
执行用时:1 ms ,在所有Java提交中击败了 18.12%的用户
内存消耗:38.3 MB，在所有Java提交中击败了85.11%的用户
*/
