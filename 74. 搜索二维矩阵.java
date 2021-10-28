class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            int cmp = matrix[mid / n][mid % n];
            if(cmp < target){
                left = mid + 1;
            }else if(cmp > target){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}

/*
执行用时:0 ms ,在所有Java提交中击败了 100.00%的用户
内存消耗:38 MB ，在所有Java提交中击败了 28.62%的用户
*/
