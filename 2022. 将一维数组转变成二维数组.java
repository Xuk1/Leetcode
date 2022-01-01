class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int sum = original.length;
        int[][] ret = new int[m][n];
        if(sum != m*n){
            int[][] a = new int[0][0];
            return a;
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ret[i][j] = original[j + i*n];
            }
        }
        return ret;
    }
}

/*
执行用时: 5 ms ,在所有Java提交中击败了 24.02%的用户
内存消耗:48.5 MB，在所有Java提交中击败了 53.65%的用户
*/
