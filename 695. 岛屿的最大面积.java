class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;                //行数
        int n = grid[0].length;             //列数
        int area = 0;
        int maxArea = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    area = GetArea(grid, i, j);
                    maxArea = area > maxArea? area: maxArea;
                }
            }
        }
        return maxArea;
    }

    public int GetArea(int[][] grid, int i, int j){
        int m = grid.length;                //行数
        int n = grid[0].length;             //列数
        if(i >= m || i < 0 || j >= n || j < 0){
            return 0;
        }
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            return (1 + GetArea(grid, i-1, j) + GetArea(grid, i+1, j) + GetArea(grid, i, j-1) + GetArea(grid, i, j+1));
        }
        return 0;
    }
}

/*
执行用时: 2 ms，在所有Java提交中击败了100.00%的用户
内存消耗:39.2MB，在所有Java提交中击败了15.56%的用户

DFS
*/
