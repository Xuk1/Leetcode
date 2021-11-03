class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int ret = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){                        //当第i个城市没有被访问过的时候，深度搜索和第i个城市相连的城市。
                dfs(isConnected, visited, i);       
                ret++;
            }
        }
        return ret;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int i){
        int n = isConnected.length;
        for(int j=0; j<n; j++){
            if(!visited[j] && isConnected[i][j] == 1){          //当第j个城市没有被访问过并且第i个和第j个城市相连的时候，标识第j个城市已经被访问过，并且继续深度搜索和第j个城市相连的城市。当所有的城市都被访问过的时候，就结束深度搜索，得到了省份的个数。
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}

/*
执行用时:1 ms ,在所有Java提交中击败了 96.22%的用户
内存消耗:39.6 MB，在所有Java提交中击败了 5.33%的用户

## DFS
* 深度搜索 与第i个城市相连的城市 ，用这个顺序遍历所有的城市
* 因为两个城市相连的时候，会出现`isConnected[i][j] == isConnected[j][i] == 1`的情况，所以需要我们自己创建一个标识数组`visited[]`用来表示这个城市是否已经被划分到一个省份里了
*/
