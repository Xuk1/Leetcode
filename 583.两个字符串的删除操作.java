class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            char c1 = word1.charAt(i-1);
            for(int j=1; j<=n; j++){
                char c2 = word2.charAt(j-1);
                if(c1 == c2){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int res = m + n - 2 * dp[m][n];
        return res;
    }
}

/*
执行用时:6 ms ,在所有Java提交中击败了 94.95%的用户
内存消耗:39 MB ，在所有Java提交中击败了46.32%的用户

使用动态规划计算出两个字符串的最长公共字符串长度，然后用原本字符串的长度-公共字符串的长度就得到了需要删减的步数
*/
