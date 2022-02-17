class Solution {
    int[][] dirs = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[n][n][k+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j][0] = 1;                                            //每一个位置行进0步还在棋盘内的概率为1
            }
        }
        for(int p = 1; p <= k; p++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int[] dir : dirs){
                        int nx = i + dir[0], ny = j + dir[1];
                        if(nx < 0 || nx >= n || ny < 0 || ny >= n){
                            continue;
                        }
                        dp[i][j][p] += dp[nx][ny][p-1] / 8;                 //dp[i][j][p]表达的意思是：从位置(i, j)行进p步还在棋盘内的概率；这个概率由从位置(i, j)行进1、2、3、...、p-1步还在棋盘内的概率相加而得
                    }
                }
            }
        }
        return dp[row][column][k];
    }
}

/*
执行用时: 7 ms ,在所有Java提交中击败了52.10%的用户
内存消耗:40.7 MB，在所有Java提交中击败了10.04%的用户

思路
像这种概率叠加的题目，需要首先想到动态规划DP
动态规划主要需要明确最终结果由哪些状态叠加而成
感悟
动态规划需要：

合理设计动态规划数组
明确边界
明确各种状态叠加的情况
*/
