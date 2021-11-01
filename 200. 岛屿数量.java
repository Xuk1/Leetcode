class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        if(grid == null || m == 0){
            return 0;
        }
        int ret = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    ret++;
                    dfs(grid, i, j);
                }
            }
        }
        return ret;
    }

    public void dfs(char[][] grid, int r, int c){
        int m = grid.length, n = grid[0].length;
        if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}

/*
执行用时: 2 ms ，在所有Java提交中击败了81.30%的用户
内存消耗:46.5 MB ，在所有Java提交中击败了39.84%的用户

## DFS
当深度搜索到1的周围的0时，停止搜索
在搜索过程中，把遍历过的1都改为0，所以不会重复遍历*/
