class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i = 0; i < m; i++){
            row[i] = 100001;
            for(int j = 0; j < n; j++){
                row[i] = Math.min(row[i], matrix[i][j]);
                col[j] = Math.max(col[j], matrix[i][j]);
            }
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == row[i] && row[i] == col[j]){
                    ret.add(row[i]);
                }
            }
        }
        return ret;
    }
}

/*
执行用时:2 ms ,在所有Java提交中击败了84.14%的用户
内存消耗:42MB ，在所有Java提交中击败了 5.17%的用户

模拟
*/
