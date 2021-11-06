class Solution {
    int m, n;
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        if(m == 0){
            return;
        }

        for(int i=0; i<m; i++){                 //先遍历与左右边界‘O’相连的‘O’，将所有相连的‘O’改为‘A’
            dfs(board, i, 0);
            dfs(board, i, n-1);
        }
        for(int i=1; i<n-1; i++){               //再遍历与上下边界‘O’相连的‘O’，将所有相连的‘O’改为‘A’
            dfs(board, 0, i);
            dfs(board, m-1, i);
        }
        for(int i=0; i<m; i++){                 
            for(int j=0; j<n; j++){
                if(board[i][j] == 'A'){         //把‘A’改为‘O’，这些都是或者与边界上的‘O’相连的‘O’
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){   //经过上面处理的剩下的‘O’都是不与边界相连的，全部改为‘X’
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int r, int c){
        if(r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'A';
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
    }
}

/*
执行用时:2 ms ，在所有Java提交中击败了 66.37%的用户
内存消耗:40.5 MB，在所有Java提交中击败了48.28%的用户

DFS
* 先从边界的‘O’开始搜索与其相连的‘O’，将他们改为‘A’
* 修改完成后，用BFS把‘A’改为‘O’，‘O’改为‘X’
* DFS的停止条件是`r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O'`
*/
