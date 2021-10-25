class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = false;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == target){
                    flag = true;
                }
            }
        }
        return flag;
    }
}

/*
执行用时:17 ms ,在所有Java提交中击败了 7.51%的用户
内存消耗:43.3 MB，在所有Java提交中击败了 97.31%的用户
*/
