class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int []> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[] {i, j});
                }else{
                    mat[i][j] = -1;
                }
            }
        }

        int[] tx = new int[] {-1, 1, 0, 0};
        int[] ty = new int[] {0, 0, -1, 1};
        while(!q.isEmpty()){
            int[] point = q.poll();
            int x = point[0], y = point[1];
            for(int i=0; i<4; i++){
                int newX = x + tx[i];
                int newY = y + ty[i];
                if(newX >= 0 && newX < m && newY >= 0 && newY < n && mat[newX][newY] == -1){
                    mat[newX][newY] = mat[x][y] + 1;
                    q.offer(new int[] {newX, newY}); 
                }
            }
        }
        return mat;
    }
}

/*
执行用时:12 ms ,在所有Java提交中击败了 72.84%的用户
内存消耗:40.4 MB，在所有Java提交中击败了88.78%的用户

使用二维数组和BFS
首先把每个源点 0 入队，然后从各个 0 同时开始一圈一圈的向 1 扩散（每个 1 都是被离它最近的 0 扩散到的 ），扩散的时候可以设置 int[][] dist 来记录距离（即扩散的层次）并同时标志是否访问过。对于本题是可以直接修改原数组 int[][] matrix 来记录距离和标志是否访问的，这里要注意先把 matrix 数组中 1 的位置设置成 -1
*/
