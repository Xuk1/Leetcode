class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            dfs(grid, i, 0);
            dfs(grid, i, n-1);
        }
        for(int j = 0; j < n; j++){
            dfs(grid, 0, j);
            dfs(grid, m-1, j);
        }

        int ret = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    ret++;
                }
            }
        }
        return ret;
    }

    public void dfs(int[][] grid, int a, int b){
        int m = grid.length, n = grid[0].length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        if(a < 0 || a >= m || b < 0 || b >= n || grid[a][b] == 0){
            return ;
        }
        grid[a][b] = 0;
        for(int[] dir : dirs){
            dfs(grid, a+dir[0], b+dir[1]);
        }
    }
}

/*
执行用时: 5 ms ,在所有Java提交中击败了48.51%的用户
内存消耗:48.6 MB，在所有Java提交中击败了 17.83%的用户

## 思路
> 主要使用了DFS
- 从位于边界的`1`入手，使用DFS判断与该边界`1`相连的`1`，可以使其都重新赋值为`0`。遍历所有边界`1`后剩下的`1`就是飞地。
## 感悟
1. 对于DFS类型的题目，可以使用以下模板进行DFS
   ```
	 public void dfs(int[][] grid, int a, int b){
        int m = grid.length, n = grid[0].length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        if(a < 0 || a >= m || b < 0 || b >= n || grid[a][b] == 0){
            return ;
        }
        grid[a][b] = 0;
        for(int[] dir : dirs){
            dfs(grid, a+dir[0], b+dir[1]);
        }
    }
	 ```
*/
